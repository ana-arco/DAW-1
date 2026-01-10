package unidad2_condicionales;
import java.util.Scanner;

/*
Calculadora de Próxima Luna Llena (Ciclo de 29 días).
@autor ANA ARCO
*/

public class A04_MoonCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year, diasDelMes;
        
        // Variable especial del ciclo lunar
        int cicloLunar = 29;

        System.out.println(" ==== CALCULADORA DE LUNA LLENA ====");

        // ----- REGISTRAR DÍA

        // Entrada simplificada para el ejemplo
        System.out.print("\n1. Introduce el día: ");
        day = sc.nextInt();

        // Validación inmediata del día
        if (day < 1 || day > 31) {
            System.out.println("ERROR: El día debe ser un número entre 1 y 31");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }
        System.out.printf("Día %d registrado.\n", day);

        // ------- REGISTRAR MES
        
        System.out.print("\n2. Introduce el mes: ");
        month = sc.nextInt();

        // validación inmediata del mes
        if (day < 1 && day > 12) {
            System.out.println("ERROR: El mes debe ser un número entre 1 y 12");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }

        // Validación de días del mes para evitar errores

        diasDelMes = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        
        if (day > diasDelMes) {
            System.out.printf("ERROR: fecha imposible, el mes %d solo tiene %d días.\n", month, diasDelMes);
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }
        
        System.out.printf("Mes %d registrado con éxito.\n", month);

        // ------ REGISTRO DEL AÑO

        System.out.print("\n3. Introduce el año: ");
        year = sc.nextInt();
        if (year < 0 || year > 3000) {
            System.out.println("ERROR: el año está fuera del rango de registros.");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }
        System.out.printf("Año %d registro con éxito.\n", year);

        // Algoritmo de ciclos
        int nextDay = day + cicloLunar;
        int nextMonth = month;
        int nextYear = year;

        // Gestión de desbordamiento
        if (nextDay > diasDelMes) {
            nextDay = nextDay - diasDelMes;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        
        System.out.printf("\nPRÓXIMA LUNA: %02d / %02d / %02d", nextDay, nextMonth, nextYear);
        
        sc.close();
    }
}
