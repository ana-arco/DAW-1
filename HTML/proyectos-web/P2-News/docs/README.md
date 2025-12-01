##  workflow-icon 🧭 Flujo de Trabajo y Metodología del Proyecto

Este documento detalla el proceso estratégico seguido para la creación de "Cultura Web Hoy", desde la idea inicial hasta la planificación arquitectónica. La metodología se basa en responder preguntas clave en cada fase antes de proceder con la implementación técnica.

---

### **Fase 1: Definición Estratégica (El "Porqué" y el "Para Quién")**

#### **Pregunta Clave:** *Antes de escribir una línea de código, ¿de qué queremos hablar y a quién nos dirigimos?*

El objetivo de esta fase fue encontrar un nicho con identidad propia, que fuera a la vez un reto académico y un proyecto personal apasionante.

* **Opción A: Periódico Genérico.**
    * *Descripción:* Cubrir noticias de actualidad generalistas (política, deportes, etc.).
    * *Decisión:* **Descartado.**
    * *Razón:* Falta de un diferenciador claro. Sería un proyecto más, sin un "alma" o una audiencia específica a la que conectar. No aprovecharía mis intereses personales.

* **Opción B: Periódico de Nicho (Cultura + Tecnología).**
    * *Descripción:* Explorar la intersección entre el arte, la cultura y el mundo digital, dirigido a un público joven, curioso y con intereses tanto creativos como tecnológicos.
    * *Decisión:* **Elegido.**
    * *Razón:* Es un proyecto con una misión clara y un público definido. Me permite convertir el periódico en un escaparate de mis propias pasiones e intereses, lo que garantiza la motivación y la calidad del contenido. Es un nicho con gran potencial de posicionamiento (SEO).

**Resultado de esta fase:** La creación de un **Manifiesto del Proyecto** y la definición de un **Lector Ideal (User Persona)**.

---

### **Fase 2: Arquitectura de la Información (El "Cómo")**

#### **Pregunta Clave:** *¿Cuál es la estructura más eficiente, profesional y escalable para construir el periódico?*

Una vez definida la idea, el siguiente paso fue planificar la estructura técnica para evitar la repetición de código y facilitar el mantenimiento a futuro.

* **Opción A: Archivos HTML Independientes.**
    * *Descripción:* Crear cada página (`articulo1.html`, `articulo2.html`, etc.) como un archivo completo y separado, copiando y pegando el `<header>`, `<nav>` y `<footer>` en cada uno.
    * *Decisión:* **Descartado.**
    * *Razón:* Es una metodología obsoleta y extremadamente ineficiente. Cualquier cambio en el menú de navegación o en el pie de página requeriría editar manualmente todos y cada uno de los archivos del proyecto, lo cual es insostenible y propenso a errores.

* **Opción B: Enfoque Modular y Basado en Plantillas.**
    * *Descripción:* Diseñar una **arquitectura de plantillas**. Esto implica crear un "molde" o esqueleto base para las páginas clave (portada, categoría, artículo) y reutilizar componentes comunes como la cabecera y el pie de página.
    * *Decisión:* **Elegido.**
    * *Razón:* Aplica el principio fundamental de desarrollo **"Don't Repeat Yourself" (DRY)**. Optimiza el flujo de trabajo, garantiza la consistencia visual y estructural en todo el sitio y hace que el proyecto sea robusto y fácil de escalar.

**Resultado de esta fase:** La definición de una **Estructura de Carpetas** profesional y el diseño de un **Plano de Contenidos** para las plantillas `index.html` y `template-articulo.html`.

---

### **Fase 3: Desarrollo de la Identidad (El "Nombre")**

#### **Pregunta Clave:** *¿Qué nombre captura la esencia del proyecto de forma clara y memorable?*

Con la estrategia y la arquitectura definidas, se procedió a encontrar un nombre que funcionara como la bandera del proyecto.

* **Opción A: Nombres Conceptuales/Evocadores.**
    * *Ejemplos:* "Lente Digital", "El Crisol".
    * *Análisis:* Son creativos y elegantes, pero pueden resultar ambiguos para un nuevo visitante.

* **Opción B: Nombres Descriptivos/Específicos.**
    * *Ejemplos:* "Música y Código", "Arte en la Red".
    * *Análisis:* Son muy claros en su nicho, pero podrían resultar limitantes si el periódico expande sus temáticas en el futuro.

* **Opción C: Nombre Híbrido (Descriptivo y Actual).**
    * *Ejemplo:* "Cultura Web Hoy".
    * *Decisión:* **Elegido.**
    * *Razón:* Es el equilibrio perfecto. Es **descriptivo** (`Cultura`, `Web`), lo que es excelente para el SEO y la claridad. Y añade un sentido de **actualidad** (`Hoy`). Es fácil de recordar, pronunciar y representa la totalidad del proyecto sin limitarlo.

**Resultado de esta fase:** La elección del nombre definitivo y la creación de un **Subtítulo o Tagline** que lo complementa.

### **Fase 4: Diseño Visual (Conceptual de la Portada)**

#### **Pregunta Clave:** *¿Qué estilo visual debe adoptar la portada para transmitir la personalidad y el propósito de "Cultura Web Hoy"?*

Se exploraron diferentes enfoques visuales para la portada con el objetivo de encontrar una estética que resonara con el manifiesto del proyecto (calma, conocimiento, reflexión, actualidad).

* **Opción A: "El Minimalista Editorial"**
    * *Descripción:* Diseño sobrio, con amplio uso de espacio en blanco, tipografía cuidada y una imagen principal potente. Evoca la seriedad de una revista de arte o un diario de opinión.
    * *Decisión:* **Elegido.**
    * *Razón:* Se alinea perfectamente con la esencia del proyecto. Transmite **calma, paz, conocimiento, seriedad y reflexión**, valores fundamentales para el contenido que se desea divulgar. Permite que la **relevancia y profundidad** de las noticias sobre cultura, arte y tecnología sean las protagonistas, sin distracciones visuales excesivas. Es una estética que honra tanto la literatura y filosofía clásicas como la innovación de la IA en el arte, creando un ambiente de actualidad relevante y aprendizaje.

* **Opción B: "El Mosaico Dinámico"**
    * *Descripción:* Portada en cuadrícula, con múltiples imágenes y un diseño enérgico y estimulante.
    * *Decisión:* **Descartado.**
    * *Razón:* Se consideró que generaba demasiada estimulación visual, alejándose del ambiente de calma y reflexión buscado.

* **Opción C: "El Inmersivo Oscuro"**
    * *Descripción:* Diseño con fondos oscuros, contrastes vibrantes y una estética futurista/cinematográfica.
    * *Decisión:* **Descartado.**
    * *Razón:* Aunque moderno, podría sesgar la percepción del periódico hacia un enfoque excesivamente tecnológico y de vanguardia, cuando el proyecto busca abarcar también temas más clásicos y de pensamiento profundo. La prioridad es el contenido reflexivo.

**Resultado de esta fase:** La definición de un **estilo visual "Minimalista Editorial"** para la portada y, por extensión, para la guía de estilo general del proyecto.

---