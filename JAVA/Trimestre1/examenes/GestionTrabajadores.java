package trimestre1.examenes;

import java.util.Scanner;

public class GestionTrabajadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] trabajadores = {
            "Ale:JAVA:342:652.2",
            "Nico:PYTON:555:2000.5",
            "Margarita:PYTHON:322:1000.1",
            "Clara:JAVA:567:1589.55",
            "Luis:CPP:777:4895",
            "Jorge:PHP:888:3200",
            "Noelia:JS:877:3501",
            "Montse:CPP:999:2009",
            "Paula:PHP:222:8000.4",
            "Iván:CPP:076:5000.60",
            "Gabriel:JS:333:654.98"
        };

        int opcion;

        // --- AQUÍ EMPIEZA LO QUE TE FALTABA ---
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción Ingresar (Pendiente)");
                    break;
                case 2:
                    System.out.println("Opción Mostrar (Pendiente)");
                    break;
                // ... puedes añadir el resto de casos aquí ...
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println(); // Salto de línea estético
        } while (opcion != 0);
        
        sc.close(); // Buena práctica: cerrar el scanner
    }

    // Función auxiliar solo para imprimir texto
    public static void mostrarMenu() {
        System.out.println("--- MENÚ GESTIÓN TRABAJADORES OPENIA ---");
        System.out.println("1. Ingresar");
        System.out.println("2. Mostrar");
        System.out.println("3. Lenguaje");
        System.out.println("4. Eliminar");
        System.out.println("5. Salarios");
        System.out.println("6. Aumento");
        System.out.println("7. Ordenar");
        System.out.println("8. Matriz");
        System.out.println("0. Salir");
    }
}