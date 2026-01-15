package trimestre1.examenes;



import java.util.*;

public class R1_estudiantes {
    Scanner sc = new Scanner(System.in);
    static int [] edades = new int[0];
    static double[] tiempos = new double [0];  
    
    // MÉTODO MAIN ------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        do {
            imprimirMenu();
            System.out.print("Elige una opción: ");
            option = sc.nextInt();
            
            // OPCIONES DEL PROGRAMA -------------------------------------------
            switch (option) {
                case 1 -> añadirRegistro();
                case 2 -> mostrarRegistros();
                case 3 -> ordenarRegistros();
                case 4 -> mostrarRangoEdad();
                case 5 -> mostrarMediaTiempo();
                case 6 -> mostrarTiempoTotal();
                case 7 -> matriz();
                case 0 -> {
                    System.out.println("Saliendo del sistema...");
                }
                default -> {
                    System.out.println("Error: Opción no válida.");
                }
            }          
        }while (option !=0);       
    }
    
    // FUNCIONES CON CADA OPCIÓN DEL MENÚ --------------------------------------
    
    // FUNCIÓN 1 - AÑADIR REGISTRO
    public static void añadirRegistro() {
        System.out.println("Añadiendo registro ...");
        pedirEdad();
        pedirTiempo();
        // Guardar en arrays: int [] edad && int [] tiempo.
        edades = Arrays.copyOf(edades, edades.length +1);
        tiempos = Arrays.copyOf(tiempos, tiempos.length +1);
        
    }
    
    // FUNCIÓN 2 - MOSTRAR REGISTROS
    public static void mostrarRegistros() {
        //
        System.out.println("Mostrando todos los registros ...");
        System.out.println(" Edad  -  Minutos ");
        System.out.println("------------------");
        System.out.println("Edad 1 - Minutos") /*edad[1] + min*/;
        System.out.println("Edad 2 - Minutos") /*edad[2] + min*/;
        System.out.println("Edad 3 - Minutos") /*edad[3] + min*/;
        System.out.println("                ");
        System.out.println("Total: 3 alumnos" /*Contador registros*/);
    }
    
    // FUNCIÓN 3 - ORDENAR REGISTROS
    public static void ordenarRegistros() {
        System.out.println("Ordenando datos por tiempo descendente ...");
        // Lógica para ordenar datos de arrays de mayor a menor
        // Imprimir los datos ya ordenados
        System.out.println(" Edad - Minutos ");
        System.out.println("------------------");
        System.out.println("Edad 1 - Minutos") /*edad[] + minMayor[1]*/;
        System.out.println("Edad 2 - Minutos") /*edad[] + minMayor[2]*/;
        System.out.println("Edad 3 - Minutos") /*edad[] + minMayor[3]*/;
        System.out.println("                ");
        System.out.println("Total: 3 alumnos" /*Contador registros*/);
    }
    
    // FUNCIÓN 4 - MOSTRAR POR RANGO DE EDAD
    public static void mostrarRangoEdad() {
        System.out.println("Mostrando registros entre dos edades ...");
        pedirRango();
        // Imprimir datos ordenados por rango
        System.out.println(" Edad - Minutos ");
        System.out.println("------------------");
        System.out.println("Edad 1 - Minutos") /*edad[] + minMayor[1]*/;
        System.out.println("Edad 2 - Minutos") /*edad[] + minMayor[2]*/;
        System.out.println("Edad 3 - Minutos") /*edad[] + minMayor[3]*/;
        System.out.println("                ");
        System.out.println("Total: 3 alumnos" /*Contador registros*/);
        System.out.println("");
    }
    
    // FUNCIÓN 5 - MOSTRAR MEDIA DE TIEMPO
    public static void mostrarMediaTiempo() {
        System.out.println("Mostrando la media aritmética de valores entre dos edades ...");
        pedirRango();
        mediaTiempo();
        // Lógica de sumar todos los minutos y dividir entre el número de valores sumados
        // Imprimir la media
        System.out.println("La media de tiempo es: " /* + el return de la función mediaTiempo()*/);
    }
    
    // FUNCIÓN 6 - MOSTRAR TIEMPO TOTAL
    public static void mostrarTiempoTotal() {
        System.out.println("Mostrando horas totales en minutos y horas ...");
        // Lógica para sumar todos los valores del array minutos y mostrar el tiempo total.
        // Imprimir la suma en minutos y horas aproximadas.
        System.out.println("Horas totales aprox: 3467" /**/);
    }
    
    // FUNCIÓN 7 - MATRIZ
    public static void matriz() {
        System.out.println("Calculando matriz ...");
        /*diferencia absoluta de diagonales. Pedir al usuario una matriz, si es cuadrada calcular la diferencia absoluta entre
        diagonales, si on lo es pide otra matriz:
        1. La suma de los elementos de la Diagonal Principal (de arriba-izquierda a abajo-derecha).
        2. La suma de los elementos de la Diagonal Secundaria (de arriba-derecha a abajo-izquierda).
        3. Calcular la diferencia absoluta entre ambas sumas.

        int [][] matriz = {
            {11,2,4},
            {4,5,6},
            {10,8,-12}
        };

        Para la matriz de ejemplo:
            Diagonal Principal: 11+5+(-12)=4
            Diagonal Secundaria: 4+5+10=19
            Diferencia Absoluta: 4-19(-15)=15
        */
        
    }
    
    // FUNCIONES AUXILIARES ---------------------------------------------------------------------------------
    
    // FUNCIÓN AUXILIAR 0 - PARA MOSTRAR MENÚ
    public static void imprimirMenu(){
        System.out.println("----------------------------------");
        System.out.println("Menú");
        System.out.println("1. Añadir");
        System.out.println("2. Mostrar");
        System.out.println("3. Ordenar");
        System.out.println("4. Usuarios entre dos edades");
        System.out.println("5. Media de valores entre edades");
        System.out.println("6. Horas totales aprox");
        System.out.println("7. Matriz");
        System.out.println("0. Salir");
    }
    
    // FUNCIÓN AUXILIAR 0 - MOSTRAR DATOS
    
    public static void mostrarDatos() {
        // con un bucle for ir recorriendo los índices del array, poner sólo un sout.
    }
    
    // FUNCIÓN AUXILIAR 1 - PEDIR EDAD
    public static void pedirEdad() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        if (edad >= 10 && edad <= 18) {
            System.out.println("Guardando edad en el sistema ....");
        } else {
            System.out.println("Edad no válida.");
        }
        
    }
    
    // FUNCIÓN AUXILIAR 2 - PEDIR TIEMPO EN MINUTOS
    public static void pedirTiempo() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduce los minutos: ");
        int min = sc.nextInt();
        System.out.println("Pasándo minutos a horas ...");
        /*
        int hora;
        if (min >= 60) {
            min = 0;
            int horaAumentada = hora + 1;
        } else {
            min = min;
        }
        comentario neccesiario necesario
        */
        System.out.printf("\nTiempo = %d minutos", min);
    }
    
    // FUNCIÓN AUXILIAR 2 - PARA PEDIR RANGO DE EDADES
    public static void pedirRango() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mayor: ");
        int mayor = sc.nextInt();
        System.out.println("Introduce el menor: ");
        int menor = sc.nextInt();
    }
    
    // FUNCIÓN AUXILIAR 3 - PARA HACER LA MEDIA DE TIEMPO
    public static void mediaTiempo() {
        
    }
}
