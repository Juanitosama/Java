package operaciones; 

import java.io.*; 

//Clase Calculos1
//Esta clase tiene como objetivo proporcionar 3 funciones  para obtener diferentes datos como el numero pi, redondear un valor o generar un número aleatorio.
public class Calculos1 { 
    
	// Función muestraPi
    // Objetivo: Mostrar el número Pi
    public static double muestraPi() { 
        return Math.PI; 
    }
    
    // Función muestraValorRedondeado
    // Objetivo: Pedir un número decimal al usuario y redondearlo.
    // Parámetros:
    // - num: Número a redondear.
    public static int muestraValorRedondeado(double num) { 
        return (int) Math.round(num); 
    }
    
    // Función muestraValorAleatorio
    // Objetivo: Genera un número aleatorio etre el 0 y el número pasado como parametro. Lo convierte en entero y lo devuelve.
    //Párametros:
    // - num: Número para generar el aleatorio entre 0 y este paámetro 
    public static int muestraValorAleatorio(int num) { 
        return (int) (Math.random() * num); 
    }
}