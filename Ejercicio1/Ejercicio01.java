import java.io.*;

public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int balones_tienda;
        int balones_queremos_comprar;
        double precio_balon;
        double dinero_pagado;

        balones_tienda = 12;
        balones_queremos_comprar = 5;
        precio_balon = 1.25;

        System.out.println("Vamos a comprar " + balones_queremos_comprar + " balones");

        // modificamos el contenido de las variables numéricas para representar la
        // compra de balones

        dinero_pagado = precio_balon * balones_queremos_comprar;
        balones_tienda = balones_tienda - balones_queremos_comprar;

        // mostramos por consola el valor de las variables numéricas. De forma implícita
        // se convierte de numero a string

        System.out.println("Nos han costado:" + dinero_pagado);
        System.out.println("En la tienda quedan " + balones_tienda + " balones");
        System.out.println("¿Cuántos balones más quieres comprar?");

        /*
         * Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
         * Las variables del tipo "BufferedReader" contienen funciones para leer datos
         * por consola
         * utilizamos la función "readLine" de la variable "br" para leer un dato por
         * consola. Guardamos el número introducido en la variable "valor_escrito"
         */

        String valor_escrito = br.readLine();

        /*
         * Convertimos mediante una conversión explicita la variable "valor_escrito"
         * a valor entero para poder operar con ély lo almacenamos en la variable.
         */

        balones_queremos_comprar = Integer.parseInt(valor_escrito);

        System.out.println("Vamos a comprar " + balones_queremos_comprar + " balones");

        // modificamos el contenido de las variables numericas para representar la
        // compra de balones.

        dinero_pagado = precio_balon * balones_queremos_comprar;
        balones_tienda = balones_tienda - balones_queremos_comprar;

        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.

        System.out.println("Nos han costado: " + dinero_pagado);
        System.out.println("En la tienda quedan " + balones_tienda + " balones");

        // Segunda parte del ejercicio.
        // Declaramos las variables y modificamos el contenido.

        double litros_zumo = 20.0;
        double precio_zumo = 3.20;
        double litros_queremos_comprar;
        double litros_restantes;
        double precio_compra;
        double compra_total;

        // Cantidad de litros de zumo en stock.
        System.out.println("La tienda tiene " + litros_zumo + " litros de zumo");

        // Precio del litro de zumo.
        System.out.println("El precio del litro de zumo es " + precio_zumo + " Euros");

        // Declarar la cantidad de litros de zumo que se van a comprar.
        System.out.println("¿Cuántos litros de zumo va a comprar?");

        // Leer el dato por consola y guardarlo en la variable "Valor2"
        String Valor2 = br.readLine();

        // Pasar la variable a un valor Double para que pueda operar con él en
        // decimales.
        litros_queremos_comprar = Double.parseDouble(Valor2);

        // Calcular el precio de la compra del zumo y los litros que restan en stock.
        precio_compra = precio_zumo * litros_queremos_comprar;
        litros_restantes = litros_zumo - litros_queremos_comprar;
        System.out.println("Quedan " + litros_restantes + "litros de zumo en la tienda");
        System.out.println("La compra de zumo ha costado " + precio_compra + " euros");

        // Calcular el precio de la compra total con los zumos y los balones
        compra_total = precio_compra + dinero_pagado;
        System.out.println("La compra total con el zumo y los balones es: " + compra_total + " Euros");
    }
}