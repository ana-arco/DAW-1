const container = document.querySelector('.content-wrapper');
const titleElement = document.querySelector('.top-bar h2');
const breadcrumbElement = document.querySelector('.breadcrumbs');

let globalXML = null;

// 1. INICIALIZACIÓN
async function init() {
    try {
        const response = await fetch('data/data.xml');
        const text = await response.text();
        const parser = new DOMParser();
        globalXML = parser.parseFromString(text, "text/xml");
        
        // Cargar por defecto Natural Tech
        loadData('collection', 'natural');
        setupMenu();
    } catch (e) {
        console.error(e);
        container.innerHTML = "Error cargando XML. Revisa la consola.";
    }
}

// 2. CONTROL DEL MENÚ
function setupMenu() {
    document.querySelectorAll('.nav-link').forEach(link => {
        link.addEventListener('click', (e) => {
            e.preventDefault();
            document.querySelectorAll('.nav-link').forEach(l => l.classList.remove('active'));
            link.classList.add('active');
            
            const mode = link.getAttribute('data-mode'); // 'collection' o 'category'
            const id = link.getAttribute('data-id');     // 'natural', 'colors', etc.
            
            loadData(mode, id);
        });
    });
}

// 3. DISTRIBUIDOR DE TRÁFICO
function loadData(mode, id) {
    container.innerHTML = ''; // Limpiar

    if (mode === 'collection') {
        renderAsCollection(id);
    } else if (mode === 'category') {
        renderAsCategory(id);
    }
}

// --- LÓGICA A: VISTA DE COLECCIÓN (AMBIENTE) ---
function renderAsCollection(collectionId) {
    // 1. Cambiar el Tema CSS
    document.body.setAttribute('data-theme', collectionId);

    // 2. Buscar datos
    const collection = globalXML.querySelector(`collection[id="${collectionId}"]`);
    if (!collection) return;

    // 3. Títulos
    const name = collection.getAttribute('name');
    const desc = collection.querySelector('description').textContent;
    titleElement.textContent = name;
    breadcrumbElement.textContent = `Colección / ${name}`;
    
    // 4. Renderizar grupos
    container.innerHTML = `<p class="section-desc">${desc}</p>`;
    const groups = collection.querySelectorAll('group');
    groups.forEach(group => renderGroup(group));
}

// --- LÓGICA B: VISTA DE CATEGORÍA (ALMACÉN) ---
function renderAsCategory(categoryId) {
    // Nota: En vista categoría, no cambiamos el tema, o usamos el default.
    // Opcional: document.body.setAttribute('data-theme', 'natural'); 

    titleElement.textContent = categoryId.charAt(0).toUpperCase() + categoryId.slice(1);
    breadcrumbElement.textContent = `Categoría Global / ${categoryId}`;
    container.innerHTML = `<p class="section-desc">Comparativa de ${categoryId} entre todos los estilos.</p>`;

    // Buscar este grupo en TODAS las colecciones
    const collections = globalXML.querySelectorAll('collection');
    
    collections.forEach(col => {
        const colName = col.getAttribute('name');
        const colId = col.getAttribute('id');
        
        // Buscar si esta colección tiene el grupo que pedimos (ej: colors)
        const group = col.querySelector(`group[type="${categoryId}"]`);
        
        if (group) {
            // Creamos un contenedor "wrapper" para simular el tema visualmente solo en esta sección
            // (Esto es un truco avanzado de CSS, pero por ahora lo pintaremos normal)
            const wrapper = document.createElement('div');
            wrapper.innerHTML = `<h3 class="section-title" style="margin-top:2rem; border-top:1px solid #ddd; padding-top:1rem;">En: ${colName}</h3>`;
            container.appendChild(wrapper);
            
            // Renderizamos el grupo
            // IMPORTANTE: Para que se vea bien, deberíamos forzar el tema, 
            // pero por simplicidad ahora verás los colores "en crudo".
            renderGroup(group);
        }
    });
}

// --- FUNCIÓN DE PINTADO COMÚN ---
function renderGroup(group) {
    const title = group.getAttribute('title');
    const type = group.getAttribute('type');
    
    let html = `<section class="section">`;
    if(title) html += `<h4 style="margin-bottom:1rem; opacity:0.7">${title}</h4>`;
    html += `<div class="grid-container">`;

    const items = group.querySelectorAll('item');
    
    items.forEach(item => {
        const name = item.querySelector('name').textContent;
        const value = item.querySelector('value').textContent;
        const meta = item.querySelector('meta').textContent;

        if (type === 'colors') {
            html += `
                <article class="card">
                    <div class="color-swatch" style="background-color: ${value};"></div>
                    <div class="card-info">
                        <h4>${name}</h4>
                        <span class="hex">${value}</span>
                        <code>${meta}</code>
                    </div>
                </article>`;
        } else if (type === 'typography') {
            const sample = item.querySelector('sample').textContent;
            html += `
                <article class="card type-card">
                    <div class="type-preview" style="font-family: ${value}; font-size: 1.3rem;">${sample}</div>
                    <div class="card-info">
                        <h4>${name}</h4>
                        <code>${value}</code>
                    </div>
                </article>`;
        } else if (type === 'buttons') {
            const sample = item.querySelector('sample').textContent;
            html += `
                <article class="card" style="align-items:center; justify-content:center; padding:2rem;">
                    <button style="background:var(--color-brand); color:white; border:none; padding:0.8rem 1.5rem; cursor:pointer; font-family:var(--font-body); border-radius:var(--radius-card); border:var(--border-width) solid white;">
                        ${sample}
                    </button>
                    <div class="card-info" style="text-align:center"><h4>${name}</h4></div>
                </article>`;
        }
    });

    html += `</div></section>`;
    
    // Convertir string a DOM
    const div = document.createElement('div');
    div.innerHTML = html;
    container.appendChild(div);
}

init();