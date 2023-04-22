package main;

import java.io.*;
import IntroDatos.*;
import operaciones.logicas.*;
import operaciones.aritmeticas.*;
import operaciones.*;

//Clase Ejecicio01
//Esta clase tiene como objetivo generar un menú con diferentes opciones y que el la función main las vaya desarrollando.
public class Ejercicio01 {
	
	// Función main
    // Objetivo: Función principal que ejecuta la opción seleccionada de la función menu.
    // Parámetros:
    // - Cada una de las diferentes case.
    public static void main(String[] args) throws Exception {
    	int op = 0; // Declaramos una variable entera llamada "op" con valor inicial de 0.
    	do { // Comenzamos un bucle do-while que se ejecutará al menos una vez.
    	    op = menu(); // Llamamos al método "menu" que devuelve la opción elegida por el usuario y lo guardamos en "op".
    	    switch(op) { // Comenzamos un switch-case para ejecutar diferentes bloques de código según el valor de "op".
    	        case 0: 
    	            System.out.println("Hasta luego Francesc!!!!!"); // Imprimimos un mensaje de despedida.
    	            break; // Salimos del case.
    	        case 1:
    	            double pi = Calculos1.muestraPi(); // Declaramos una variable double llamada "pi" y le asignamos el valor que devuelve el método "muestraPi" de la clase "Calculos1".
    	            System.out.println("Valor de Pi: " + String.format("%.6f", pi)); // Imprimimos por pantalla el valor de "pi" reducido a 6 decimales.
    	            break; // Salimos del case.
    	        case 2:
    	            double num = Filtro.pideDouble("Introduce un número decimal para redondear: ", 1, Integer.MAX_VALUE); // Declaramos una variable double llamada "num" y le asignamos el valor que devuelve el método "pideDouble" de la clase "Filtro" al pasarle los argumentos indicados.
    	            int ValorRedondeado = Calculos1.muestraValorRedondeado(num); // Declaramos una variable entera llamada "ValorRedondeado" y le asignamos el valor que devuelve el método "muestraValorRedondeado" de la clase "Calculos1" al pasarle "num" como argumento.
    	            System.out.println("El valor redondeado de " + num + " es: " + ValorRedondeado); // Imprimimos por pantalla el valor de "num" y "ValorRedondeado".
    	            break; // Salimos del case.
    	        case 3:
    	            int n2 = Filtro.pideEntero("Introduce un número y saco un número aleatorio entre ese número y el 0: ", 1 , Integer.MAX_VALUE); // Declaramos una variable entera llamada "n2" y le asignamos el valor que devuelve el método "pideEntero" de la clase "Filtro" al pasarle los argumentos indicados.
    	            int ValorAleatorio = Calculos1.muestraValorAleatorio(n2); // Declaramos una variable entera llamada "ValorAleatorio" y le asignamos el valor que devuelve el método "muestraValorAleatorio" de la clase "Calculos1" al pasarle "n2" como argumento.
    	            System.out.println("El valor aleatorio entre 0 y " + n2 +" Es: " + ValorAleatorio); // Imprimimos por pantalla el valor de "n2" y "ValorAleatorio".
    	            break; // Salimos del case.
    	        case 4:
    	            double n1 = Filtro.pideDouble("Introduce un ángulo entre 0º y 360º: ", 0, 360); // Declaramos una variable double llamada "n1" y le asignamos el valor que devuelve el método "pideDouble" de la clase "Filtro" al pasarle los argumentos indicados.
    	            double seno = Operacionesmates.muestraseno(n1); // Declaramos una variable double llamada "seno" y le asignamos el valor que devuelve el método "muestraseno" de la clase "Operacionesmates" al pasarle "n1" como argumento.
    	            System.out.println("El seno de " + n1 + " es: " + String.format("%.2f", seno) + "."); // Imprimimos por pantalla el "seno" reducido a 2 decimales.
    	            break; // Salimos del case.
    	        case 5:
    	            double n = Filtro.pideDouble("Introduce un número que no sea negativo: ", 1, Integer.MAX_VALUE); // Declaramos una variable double llamada "n" y le asignamos el valor que devuelve el método "pideDouble" de la clase "Filtro" al pasarle los argumentos indicados.
    	            double raiz = Operacionesmates.calcularaiz(n); // Declaramos una variable double llamada "raiz" y le asignamos el valor que devuelve el método "calcularaiz" de la clase "Operacionesmates" al pasarle "n" como argumento.
    	            System.out.println("La raíz de " + n + " es :" + String.format("%.4f", raiz) + "."); // Imprimimos por pantalla el valor "raiz" reducido a 4 decimales.
    	            break; // Salimos del case.
    	        case 6:
    	            double num1 = Filtro.pideDouble("Introduce el primer número: ", Integer.MIN_VALUE, Integer.MAX_VALUE); // Declaramos una variable double llamada "num1" y le asignamos el valor que devuelve el método "pideDouble" de la clase "Filtro" al pasarle los argumentos indicados.
    	            double num2 = Filtro.pideDouble("Introduce el segundo número: ", Integer.MIN_VALUE, Integer.MAX_VALUE); // Declaramos una variable double llamada "num2" y le asignamos el valor que devuelve el método "pideDouble" de la clase "Filtro" al pasarle los argumentos indicados.
    	            double num3 = Filtro.pideDouble("Introduce el tercer número: ", Integer.MIN_VALUE, Integer.MAX_VALUE); // Declaramos una variable double llamada "num3" y le asignamos el valor que devuelve el método "pideDouble" de la clase "Filtro" al pasarle los argumentos indicados.
    	            double media = Operacionespropias.media3Numeros(num1, num2, num3); // Declaramos una variable double llamada "media" y le asignamos el valor que devuelve el método "media3Numeros" de la clase "Operacionespropias" al pasarle los argumentos "num1", "num2" y "num3".
    	            System.out.println("La media de " + num1 + ", " + num2 +", " + "y "+ num3 + " es: " + String.format("%.3f", media) + "."); // Imprimimos por pantalla el valor de "media" y le decimos que solo tenga 3 decimales.
    	            break; // Salimos del case.
    	        case 7:
    	            int numb = Filtro.pideEntero("Introduce un número del 1 al 7 y te digo que dia de la semana es!: ", 1, 7); // Declaramos una variable entera llamada "numb" y le asignamos el valor que devuelve el método "pideEntero" de la clase "Filtro" al pasarle los argumentos indicados.
    	            String dia = Operacionespropias.muestraNombreDia(numb); // Declaramos una variable String llamada "dia" y le asignamos el valor que devuelve el método "muestraNombreDia" de la clase "Operacionespropias" al pasarle "numb" como argumento.
    	            System.out.println("El día " + numb + " es " + dia + "."); // Imprimimos por pantalla el valor de "numb" y "dia".
    	            break; // Salimos del case.
            }
        } while (op != 0);// Mientras el número introducido no sea 0 el programa sigue funcionando. Cuando sea 0 cierra.
    }

    
    // Función menu
    // Objetivo: Generar un menú donde el usuario puede ver las diferentes opciones.
    // Parámetros:
    // - Un número int mediante la variable op que ha de estar comprendido entre en 0 y el 7
    public static int menu() throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr); 
        System.out.println("0-Salir.");
        System.out.println("1-Muestra Pi.");
        System.out.println("2-Muestra el valor redondeado del valor introducido.");
        System.out.println("3-Muestra un valor aleatorio entre 0 y el valor introducido.");
        System.out.println("4-Muestra el seno.");
        System.out.println("5-Muestra la raíz cuadrada.");
        System.out.println("6-Media aritmética de 3 numeros decimales.");
        System.out.println("7-Pide número entero e indica que dia de la semana es.");
        int op = Filtro.pideEntero("Opción: ", 0, 7); 
        return op; 
    }
}