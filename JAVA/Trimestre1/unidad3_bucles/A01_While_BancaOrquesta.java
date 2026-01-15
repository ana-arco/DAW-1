package trimestre1.unidad3_bucles;

import java.util.Scanner;

/**
 * Ejercicio 1 (Bucles): Auditoría de transaccions Financieros.
 * Procesamos transacciones una a una hasta que el usuario introduce 0 para cerrar caja.
 * @author ANA ARCO - Gestora Cultural
 */

public class A01_While_BancaOrquesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int transaccion; // La cantidad de dinero a registrar
        
        System.out.println("=== AUDITORÍA DE CAJA: GIRA SINFÓNICA ===");
        System.out.println("Instrucciones:");
        System.out.println(" - Introduce cantidades (positivas para ingresos, negativas para gastos).");
        System.out.println(" - Escribe '0' para CERRAR LA SESIÓN y terminar.\n");

        // 1. PRIMERA LECTURA (El primer empujón para arrancar)
        // Necesitamos pedir el dato una vez antes de preguntar al 'while' si entramos.
        System.out.print(" Introduce la primera transaccion (€): ");
        transaccion = sc.nextInt();

        // 2. EL BUCLE (La Sala de Máquinas)
        // Traducción: "Mientras el transaccion NO sea 0, sigue trabajando"
        while (transaccion != 0) {
            
            System.out.println("   ... Analizando transacción: " + transaccion + "€ ...");

            // A) ANÁLISIS DE SIGNO (Ingreso vs Gasto)
            if (transaccion > 0) {
                System.out.println("TIPO: INGRESO (Taquilla/Subvención)");
            } else {
                System.out.println("TIPO: GASTO (Pago proveedores/Caché)");
            }

            // B) CÓDIGO DE CONTROL (Par/Impar)
            // Imaginemos que los importes impares saltan una alerta de revisión.
            if (transaccion % 2 == 0) {
                System.out.println(" PROCESO: Automático (Cifra par)");
            } else {
                System.out.println("PROCESO: Requiere Revisión Manual (Cifra impar)");
            }

            // C) CÁLCULO DE MAGNITUD (El Cuadrado)
            // Elevamos al cuadrado para ver el "peso" estadístico del transaccion
            // (y cumplimos con el requisito académico de calcular el cuadrado).
            long impacto = (long) transaccion * transaccion; 
            System.out.println("ÍNDICE DE IMPACTO (Cuadrado): " + impacto);
            
            System.out.println("   -----------------------------------");

            // 3. ACTUALIZACIÓN (CRÍTICO)
            // Antes de terminar la vuelta, debemos pedir el SIGUIENTE dato.
            // Si olvidamos esto, el bucle sería infinito (nunca valdría 0) y el ordenador se colgaría.
            System.out.print("Introduce siguiente transaccion (0 para salir): ");
            transaccion = sc.nextInt();
        }

        // Si llegamos aquí, es porque el usuario escribió 0 y el 'while' nos expulsó.
        System.out.println("\nSESIÓN CERRADA. Caja finalizada.");
        sc.close();
    }
}
