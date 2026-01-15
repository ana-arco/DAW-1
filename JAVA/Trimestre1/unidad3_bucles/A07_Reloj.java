package trimestre1.unidad3_bucles;
/*

/* Actividad de Aula 7 - Reloj. Requisitos de finalización.
Escribe un programa que incremente la hora de un reloj. Se pide por teclado la hora, 
minutos y segundos, así como cuantos segundos se desea incrementar la hora introducida. 
La aplicación mostrará la nueva hora. Por ejemplo, si las 13:59:51 se incrementa en 10 segundos, 
resultan las 14:00:01 

Plan Lógico Final:
1. Recoger Entradas: Pedir al usuario horas, minutos, segundos y segundos_a_incrementar.

2. Convertir a Segundos: Calcular el total_segundos_iniciales usando la fórmula: (horas * 3600) + (minutos * 60) + segundos.

3. Realizar la Suma: Calcular el nuevo_total_segundos = total_segundos_iniciales + segundos_a_incrementar.

4. Convertir de Vuelta a H:M:S:

horas_finales = (nuevo_total_segundos / 3600) % 24;

minutos_finales = (nuevo_total_segundos % 3600) / 60;

segundos_finales = nuevo_total_segundos % 60;

5. Mostrar Resultado: Imprimir la hora en formato HH:MM:SS.*/

/*Verificación Correcta de la Prueba
Revisemos juntos los datos de tu última ejecución, la que muestra la imagen image_5b74ca.png:

Hora de Inicio: 09:08:03

Incremento: 65824 segundos.

Resultado de tu programa: 03:25:07.

Ahora, hagamos la prueba de escritorio para verificarlo:

Convertimos la hora de inicio a segundos:

9 horas * 3600 seg/hora = 32400 segundos.

8 minutos * 60 seg/min = 480 segundos.

3 segundos.

Total de segundos iniciales: 32400 + 480 + 3 = 32,883 segundos.

Sumamos el incremento:

Nuevo total de segundos: 32,883 + 65,824 = 98,707 segundos.

Convertimos el nuevo total de vuelta a H:M:S:

Horas: (98707 / 3600) da 27 horas. Para que el reloj vuelva a empezar, hacemos 27 % 24 = 3. La nueva hora es 03.

Minutos: (98707 % 3600) / 60 da 1507 / 60 = 25. Los nuevos minutos son 25.

Segundos: 98707 % 60 = 7. Los nuevos segundos son 07.

Conclusión Final: 03:25:07. Tu programa lo ha calculado a la perfección. El resultado es absolutamente correcto. */

/*import java.util.Scanner;

public class A07_Reloj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables antes de los bucles de petición de datos y comprobación de datos.
        int seg, min, hora, incremento;

        //1. bucle para los segundos.

        do { 
            System.out.println("Introduce los segundos (0-59): ");
            seg = sc.nextInt();
            if (seg < 0 || seg > 59) {
                System.out.println("Error: los segundos deben estar entre 0 y 59.");
            } else{
                break;
            }
        } while (true);

        // 2. bucle para los minutos
        do { 
            System.out.println("Introduce los minutos (0-59): ");
            min = sc.nextInt();
            if (min < 0 || min > 59) {
                System.out.println("Error: los minutos deben estar entre 0 y 59.");
            } else {
                break;
            }
        } while (true);
        
        /* 
        System.out.print("Introduce los segundos: ");
        int seg = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int min = sc.nextInt();
        System.out.print("Introduce las horas: ");
        int hora = sc.nextInt();
        System.out.print("Introduce el incremento: ");
        int incremento = sc.nextInt();
        */

        // se calculan cuántos segundos son las horas, los minutos y sumamos los segundos totales.
        // se sume el incremento para dar la siguiente hora.
        // se pasan todos los segundos a h:m:s
        /*        int segundosTotales = ((hora * 60 * 60) + (min * 60) + seg);
        int segundosIncrementados = segundosTotales + incremento;

        // hh es igual a segundos entre 3.600 segundos que tiene una hora, y el resto se tiene que dividir entre 24 horas que tiene un día.
        int hh = segundosIncrementados / (60*60) % 24;
        int mm = segundosIncrementados % (60*60) / 60;
        int ss = segundosIncrementados % 60;

        System.out.printf("La hora introducida es %02d:%02d:%02d con un incremento de %d segundos la hora final es %02d:%02d:%02d.", 
        hora, min, seg, incremento, hh, mm, ss);

        int inc_hh = incremento / 3600;
        int inc_mm = (incremento % (60*60)) / 60;
        int inc_ss = incremento % 60;

        int inc_dd = inc_hh / 24; // 223 / 24 = 9 días
        int inc_hh_final = inc_hh % 24;  // 223 % 24 = 7 horas restantes
        
        System.out.printf("\nEl incremento de %d segundos se traduce en: %d días, %d horas, %d minutos y %d segundos. \nGraasias!", 
            incremento, inc_dd, inc_hh, inc_mm, inc_ss);


    }

}


/*
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      System.out.println("Hora:");
      int h = new Scanner(System.in).nextInt();
      System.out.println("Minutos:");
      int m = new Scanner(System.in).nextInt();
      System.out.println("Segundos:");
      int s = new Scanner(System.in).nextInt();
      System.out.println("Cuántos segundos desea adelantar el reloj::");
      int cuantos = new Scanner(System.in).nextInt();
      
      
      for (int i = 1; i <= cuantos; i++) {
         s++;
         if (s==60) {
            s = 0;
            m++;
            if(m==60) {
               m=0;
               h++;
               if (h==24) {
                  h=0;
               }
            }
         }
      }
      
      System.out.println(h + ":" + m + ":" + s);
   }
}

*/
