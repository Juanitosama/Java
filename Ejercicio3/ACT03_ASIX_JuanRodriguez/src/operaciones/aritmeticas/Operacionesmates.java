package operaciones.aritmeticas;

import java.io.*;

//Clase Operacionesmates
//Esta clase tiene como objetivo proporcionar dos funciones , una que mediante un ángulo dado por el usuario genere el seno de ese ángulo y otra
//función que calcula la raid cuadrada de un número también dado por el usuario.
public class Operacionesmates{
	
	// Función muestraseno
    // Objetivo: Pedir un número un número al usuario entre 0 y 360 simulando los º de una circunderencia,
	//luego lo pasaa a radianes y realiza el cálculo del seno.
    // Parámetros:
    // - num: Valor entre 0º y 360º.
	public static double muestraseno(double num) {
	    double radianes = Math.toRadians(num);
	    return Math.sin(radianes);
	}
	
	// Función calcularaiz
    // Objetivo: Pedir un número al usuario y realizar su raiz cuadrada.
    // Parámetros:
    // - num: Valor double.
	public static double calcularaiz (double num) {
		return Math.sqrt(num);
	}
}