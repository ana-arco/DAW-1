
import java.util.Scanner;

public class Microsoft {

    // --- 1. VARIABLES GLOBALES (STATIC) ---
    
    // Constante para el tamaño máximo
    static final int CAPACIDAD_MAXIMA = 100;

    // Arrays paralelos
    static String[] datosUsuario = new String[CAPACIDAD_MAXIMA];
    static double[] sueldo = new double[CAPACIDAD_MAXIMA];
    static int[] nivel = new int[CAPACIDAD_MAXIMA];

    // Contador para saber cuántos empleados reales tenemos
    static int cantidadActual = 0;
    
    // Scanner global
    static Scanner sc = new Scanner(System.in);

    
    // --- 2. MAIN --- 
    public static void main(String[] args) {
        

        System.out.println("Sistema de gestión Microsoft iniciado...");
        // El main solo da la orden de arranque

        ejecutarMenuPrincipal();
    }

    // --- 3. FUNCIONES ---

   
    // FUNCIÓN 3: VISUAL. Solo se encarga de imprimir las opciones por pantalla.

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ GESTIÓN MICROSOFT ===");
        System.out.println("1. Cálculo de matriz de datos IA");
        System.out.println("2. Ingresar usuario");
        System.out.println("3. Mostrar empleados entre dos niveles");
        System.out.println("4. Edad máxima y mínima");
        System.out.println("5. Media de edad");
        System.out.println("6. Mostrar datos");
        System.out.println("7. Eliminar un usuario");
        System.out.println("8. Ordenar");
        System.out.println("0. Salir");
        System.out.print("--> Elige una opción: ");
    }

    //Controla el flujo principal del programa: bucle y switch.

    public static void ejecutarMenuPrincipal() {
        int opcion; 

        do {
            mostrarMenu(); // Llama a la función que imprime las letras
            opcion = sc.nextInt(); // Lee la opción

            switch (opcion) {
                case 1:
                    calcularMatrizIA();
                    break;
                case 2:
                    ingresarUsuario();
                    break;
                case 3:
                    mostrarPorNiveles();
                    break;
                case 4:
                    System.out.println("Función Edad Max/Min (Pendiente...)");
                    break;
                case 5:
                    System.out.println("Función Media Edad (Pendiente...)");
                    break;
                case 6:
                    mostrarDatos();
                    break;
                case 7:
                    System.out.println("Función Eliminar (Pendiente...)");
                    break;
                case 8:
                    System.out.println("Función Ordenar (Pendiente...)");
                    break;
                case 0:
                    System.out.println("Cerrando sistema. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);
    }

    /**
     * Opción 1: Matriz IA. Crea una matriz predefinida y suma sus columnas.
     */
    public static void calcularMatrizIA() {
        System.out.println("\n--- CÁLCULO MATRIZ IA ---");

        // 1. Declaramos la matriz del ejemplo del examen (Hardcoded)
        double[][] tiempos = {
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6}
        };

        // 2. Crear el array donde guardaremos los resultados
        // El tamaño debe ser igual al número de COLUMNAS de la matriz (tiempos[0].length)
        double[] sumaColumnas = new double[tiempos[0].length];

        // 3. Recorremos la matriz para sumar
        // i = filas, j = columnas
        for (int i = 0; i < tiempos.length; i++) { //i = filas j = columnas
            for (int j = 0; j < tiempos[i].length; j++) {
                // Acumulamos el valor en la posición correspondiente a su columna
                sumaColumnas[j] += tiempos[i][j];
            }
        }

        // 4. Imprimir resultados
        System.out.print("Resultado suma columnas: [ ");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.print(sumaColumnas[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Opción 2: Ingresar usuario. Pide los datos, comprime nombre+dni+edad en un String y guarda el resto.
     */
    public static void ingresarUsuario() {
        // 1. Validar si cabe alguien más
        if (cantidadActual >= CAPACIDAD_MAXIMA) {
            System.out.println("¡Error! La base de datos está llena.");
            return; // Nos vamos de la función
        }

        System.out.println("\n--- NUEVO EMPLEADO ---");
        
        // Limpieza de buffer (vital cuando mezclamos números y textos)
        // Si venimos de leer un número en el menú, el "Intro" se queda flotando.
        sc.nextLine(); 

        // 2. Pedir datos para el String comprimido
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt(); // Leemos edad como entero primero

        // 3. TRUCO DE LA COMPRESIÓN (Requisito del examen)
        // Guardamos: "Pepe;111A;30"
        String datosComprimidos = nombre + ";" + dni + ";" + edad;
        
        // 4. Pedir el resto de datos
        System.out.print("Sueldo: ");
        double salario = sc.nextDouble();

        System.out.print("Nivel (1-10): ");
        int nivelProgramacion = sc.nextInt();

        // 5. GUARDAR EN LOS ARRAYS (Usamos cantidadActual como índice)
        datosUsuario[cantidadActual] = datosComprimidos;
        sueldo[cantidadActual] = salario;
        nivel[cantidadActual] = nivelProgramacion;

        // 6. ACTUALIZAR CONTADOR
        cantidadActual++; 
        System.out.println("Usuario guardado correctamente. Total: " + cantidadActual);
    }

    /**
     * Opción 6: Mostrar datos. Recorre los usuarios, "rompe" el String comprimido y muestra todo bonito.
     */
    public static void mostrarDatos() {
        System.out.println("\n--- LISTA DE EMPLEADOS MICROSOFT ---");
        
        // Validación básica: si está vacío, avisamos
        if (cantidadActual == 0) {
            System.out.println("No hay empleados registrados todavía.");
            return;
        }

        for (int i = 0; i < cantidadActual; i++) {
            // 1. Recuperamos el paquete comprimido
            String paquete = datosUsuario[i]; 
            
            // 2. ¡LA CLAVE! Cortamos por el punto y coma
            // Si paquete es "Pepe;111A;30", partes tendrá 3 huecos.
            String[] partes = paquete.split(";");
            
            // Asignamos nombres claros para no liarnos (esto es Clean Code)
            String nombre = partes[0];
            String dni = partes[1];
            String edad = partes[2]; // Sigue siendo texto aquí
            
            // 3. Imprimimos formateado
            System.out.println("Empleado #" + (i + 1));
            System.out.println("   Nombre: " + nombre);
            System.out.println("   DNI:    " + dni);
            System.out.println("   Edad:   " + edad);
            System.out.println("   Sueldo: " + sueldo[i] + " €");
            System.out.println("   Nivel:  " + nivel[i]);
            System.out.println("-------------------------------");
        }
    }

    /**
     * Opción 3: Mostrar empleados entre dos niveles
     * Filtra los usuarios cuyo nivel esté dentro del rango introducido.
     */
    public static void mostrarPorNiveles() {
        System.out.println("\n--- FILTRAR POR NIVELES ---");
        
        // 1. Pedimos el rango
        System.out.print("Introduce el nivel MÍNIMO: ");
        int min = sc.nextInt();
        
        System.out.print("Introduce el nivel MÁXIMO: ");
        int max = sc.nextInt();

        // Truco PRO: Si el usuario pone (5, 1), los intercambiamos para que el bucle funcione
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        }

        System.out.println("Listando empleados entre nivel " + min + " y " + max + ":");
        boolean hayResultados = false; // Chivato para saber si encontramos a alguien

        for (int i = 0; i < cantidadActual; i++) {
            // 2. La Condición del Filtro
            if (nivel[i] >= min && nivel[i] <= max) {
                
                String[] partes = datosUsuario[i].split(";");
                String nombre = partes[0];
                String dni = partes[1];
                String edad = partes[2];

                // 4. Imprimimos
                System.out.println("-> " + nombre + " (Nivel: " + nivel[i] + ")");
                System.out.println("   DNI: " + dni + " | Edad: " + edad + " | Sueldo: " + sueldo[i]);
                System.out.println("-------------------------");
                
                hayResultados = true;
            }
        }

        if (!hayResultados) {
            System.out.println("No se encontraron empleados en ese rango de niveles.");
        }
    }

}
