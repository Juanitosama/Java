package operaciones.logicas; 

import java.io.*; 

//Clase Filtro
//Esta clase tiene como objetivo proporcionar dos funciones, una para obtener una média aritmética de 3 valores dados por el usuario
//y otra para generar a través de un número entre en 1 y el 7 devolver el dia de la semana correspondiente.
public class Operacionespropias { 

	// Función media3Numeros
    // Objetivo: Pedir 3 números double al usuario y devolver una média aritmética a través de la variable "media". 
    // Parámetros:
    // - n1: Número double.
    // - n2: Número double.
    // - n3: Número double.
    public static double media3Numeros(double n1, double n2, double n3) { 
        double media = (n1 + n2 + n3) / 3; 
        return media; 
    }

	// Función muestraNombreDia
    // Objetivo: Pedir un numero entre en 1 y el 7 al usuario y generar el dia de la semana correspondiente que lo devuelve a traves de la variable "nombreDia".
    // Parámetros:
    // - numb: int.
    public static String muestraNombreDia(int numb) { 
        String nombreDia; 
        switch(numb) { 
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "No es un número válido de día de la semana"; 
                break;
        }
        return nombreDia; 
    }
}

