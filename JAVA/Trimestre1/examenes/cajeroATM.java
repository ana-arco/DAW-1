package trimestre1.examenes;

/* Descripción del Programa
Crearás una aplicación de consola que simula las operaciones básicas de un cajero automático. El
programa comenzará con un saldo inicial (por ejemplo, 1000 euros) y mostrará un menú con las
siguientes opciones:
1. Consultar saldo: Muestra el saldo actual de la cuenta.
2. Ingresar dinero: Pide al usuario una cantidad y la añade al saldo.
3. Retirar dinero: Pide al usuario una cantidad y, si hay saldo suficiente, la resta del total.
4. Salir: Termina la ejecución del programa.
El programa debe mostrar el menú repetidamente hasta que el usuario elija la opción "Salir".*/

/*Requisitos Técnicos
Para desarrollar esta actividad, se deben seguir las siguientes pautas:
1. Variables:
○ Utiliza una variable de tipo double para almacenar el saldo de la cuenta. Iníciala con un valor,
por ejemplo, 1000.0.
○ Necesitarás una variable para guardar la opción del usuario (tipo int) y otra para leer las
cantidades de dinero (tipo double).
2. Modularidad (Funciones): El código debe estar bien organizado en funciones para separar las
responsabilidades. Es fundamental que entiendas cómo pasar variables a las funciones y cómo estas
pueden devolver un valor. Crea, como mínimo, las siguientes funciones:
○ void mostrarMenu(): No recibe ni devuelve nada. Simplemente imprime el menú de opciones
en la consola.
○ void consultarSaldo(double saldoActual): Recibe el saldo como parámetro y lo muestra por
pantalla.
○ double ingresarDinero(double saldoActual): Recibe el saldo actual, pide al usuario la cantidad a
ingresar, la suma y devuelve el nuevo saldo actualizado.
○ double retirarDinero(double saldoActual): Recibe el saldo actual, pide al usuario la cantidad a
retirar y realiza la validación.
■ Condicional: Si la cantidad a retirar es menor o igual al saldo, la resta y devuelve el nuevo
saldo.

■ Condicional: Si la cantidad es mayor que el saldo, debe mostrar un mensaje de error
("Saldo insuficiente") y devolver el saldo sin modificar.

3. Flujo del programa (Bucles y Condicionales):
○ El cuerpo principal del programa (main) debe contener un bucle do-while o while que se ejecute
mientras la opción elegida por el usuario no sea la de salir (por ejemplo, 4).
○ Dentro del bucle, utiliza una estructura switch o if-else if para llamar a la función
correspondiente según la opción del usuario.
○ Importante: El saldo, que es la variable principal, se actualizará en el main con el valor que
devuelvan las funciones ingresarDinero y retirarDinero. Por ejemplo: saldo =
ingresarDinero(saldo);. */

/* Ejemplo de Funcionamiento en Consola
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Elige una opción: 1
Tu saldo actual es: 1000.0 €
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Elige una opción: 2
¿Qué cantidad deseas ingresar?: 250.50
Ingreso realizado correctamente.
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Elige una opción: 1
Tu saldo actual es: 1250.5 €
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero

3. Retirar dinero
4. Salir
Elige una opción: 3
¿Qué cantidad deseas retirar?: 2000
Error: Saldo insuficiente.
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Elige una opción: 3
¿Qué cantidad deseas retirar?: 50.50
Retirada realizada correctamente.
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Elige una opción: 1
Tu saldo actual es: 1200.0 €
*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Elige una opción: 4
Gracias por utilizar nuestros servicios. ¡Hasta pronto!

Puntos a Evaluar

● Correcto uso de variables y tipos de datos (double para el dinero, int para la opción).
● Lógica de control: Uso adecuado del bucle do-while y la estructura switch para controlar el flujo

del programa.
● Modularidad y Funciones: ¿El código está correctamente dividido en funciones? ¿Se pasan los
parámetros de forma correcta?
● Valores de Retorno: ¿Las funciones ingresarDinero y retirarDinero devuelven correctamente el
saldo actualizado? ¿Se asigna este valor de vuelta a la variable saldo en el main?
● Validación de datos: ¿El programa controla correctamente el caso de intentar retirar más dinero del
disponible?
● Claridad y legibilidad del código.*/



public class cajeroATM {
    
}
