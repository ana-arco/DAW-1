/*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que cada animal come una media de kilosPorAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones por cero. */

/* * ENUNCIADO: GESTIÓN DE VIABILIDAD ECONÓMICA DE UNA ORQUESTA
 * * Contexto: Como gestora cultural, debes administrar los recursos para la próxima gira 
 * de una Orquesta Sinfónica. Dispones de una subvención o presupuesto diario limitado.
 * * Variables:
 * 1. presupuestoTotal: La cantidad total de dinero disponible para el evento.
 * 2. numMusicos: El número de intérpretes que forman la plantilla de la orquesta.
 * 3. cachePorMusico: El sueldo o viático ideal que debería cobrar cada músico.
 * * Objetivo del Programa:
 * Diseñar una herramienta de tesorería que solicite al usuario los valores anteriores 
 * y determine si el presupuesto es suficiente para cubrir el caché estipulado de todos los músicos.
 * * - Si hay SUPERÁVIT (hay dinero suficiente): Confirmar la viabilidad del concierto.
 * - Si hay DÉFICIT (falta dinero): Calcular el nuevo sueldo ajustado (prorrateo) 
 * que recibiría cada músico para poder realizar el concierto sin entrar en pérdidas.
 * * Nota Técnica: Implementar medidas de seguridad para evitar errores matemáticos 
 * críticos (como la división por cero) si la plantilla de músicos es 0.
 */

    /* ADAPTACIÓN. Cambié el tema del ejercicio para hacerlo como una Gestión de Recursos para una orquesta, que sería sueldo por músico, en vez de comida Diaria.
    Recurso total: comida -> presupuesto/subvención
    Población: Población -> Músicos Orquesta
    Necesidad individual: kilos -> sueldo por músico 
    */

//package unidad2_condicionales;
package U2_condicionales;

import java.util.Scanner;

public class A07_Animales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // VARIABLES DE GESTIÓN CULTURAL
        double presupuestoDisponible;
        int numMusicos;
        double cacheMusico;

        System.out.println("Gestión de tesorería: Gira Manuel de Falla");
        System.out.println("Calculadora de viabilidad económica para el concierto. \n");

        // 1. Pedir y guardar datos

        System.out.print("1. Presupuesto total disponible (Subvención/Taquilla): ");
        presupuestoDisponible = sc.nextDouble();

        // validación para evitar presupuestos negativos

        if (presupuestoDisponible < 0 ) {
            System.out.println("Error: el presupuesto debe ser en números positivos.");
            System.out.println("Se cancela la gestión. ");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }

        System.out.print("2. Número de músicos: ");
        numMusicos = sc.nextInt();

        // validaciones (evitar división por cero)
        // Si no hay músicos, no hay concierto y no podemos dividir el dinero entre nadie

        if (numMusicos <= 0) {
            System.out.println("Error: la plantilla está vacía (0 músicos).");
            System.out.println("Se cancela la gestión por falta de personal.");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }

        System.out.print("3. Caché/Viático ideal por músico (sueldo de cada músico): ");
        cacheMusico = sc.nextDouble();

        // validaciones
        if (cacheMusico <= 0 ) {
            System.out.println("Error: ha introducido una cantidad no válida.");
            System.out.println("Se cancela la gestión.");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }

        // 2. CÁLCULO DE VIABILIDAD
        // ¿Cuánto dinero necesitamos realmente para pagar lo que piden?
        double presupuestoNecesario = numMusicos * cacheMusico;

        // 3. AUDITORÍA (DECISIÓN)
        if (presupuestoDisponible >= presupuestoNecesario) {
            // CASO A - SUPERÁVIT (hay dinero de sobra)
            System.out.println("ACEPTADO: El presupuesto cubre el 100% de los honorarios.");

            double superavit = presupuestoDisponible - presupuestoNecesario;

            System.out.printf("\nSe pueden pagar %.2f euros a cada músico.", cacheMusico);
            System.out.printf("\nQuedan %.2f disponibles para imprevistos o fondo de reserva.", superavit);
            System.out.println(" ");
            System.out.println("Gracias por consultarnos.");
        } else {
            // CASO B - DÉFICIT (no hay dinero suficiente)
            System.out.println("DENEGADO: El presupuesto no cubre los honorarios del concierto.");

            double deficit = presupuestoNecesario - presupuestoDisponible;
            double nuevoCacheReal = presupuestoDisponible / numMusicos;

            System.out.printf("\nFaltan %.2f euros pra cubrir el caché de cada músico.", deficit);
            System.out.printf("\nEl pago máximo viable por músico será: %.2f euros (Solicitado: %.2f)\n", nuevoCacheReal, cacheMusico);
            System.out.println(" ");
            System.out.println("Gracias por consultarnos.");
            System.out.println(" ");

        }                
    }
}