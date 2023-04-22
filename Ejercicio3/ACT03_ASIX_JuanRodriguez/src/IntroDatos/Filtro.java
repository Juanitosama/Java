package IntroDatos; 

import java.io.*; 

// Clase Filtro
// Esta clase tiene como objetivo proporcionar dos funciones estáticas para obtener números enteros y decimales
// del usuario, garantizando que los números ingresados estén dentro de un rango específico.
public class Filtro { 

    // Función pideEntero
    // Objetivo: Pedir un número entero al usuario y asegurar que se encuentre dentro del rango [min, max]
    // Parámetros:
    // - mensaje: Mensaje que se mostrará al usuario antes de solicitar el número
    // - min: Límite inferior del rango
    // - max: Límite superior del rango
    public static int pideEntero(String mensaje, int min, int max) throws Exception { 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); 
        boolean correcto; 
        int num = 0;
        do {
            correcto = true; 
            try { 
                do { 
                    System.out.println(mensaje); 
                    num = Integer.parseInt(br.readLine()); 
                } while (num < min || num > max); 
            } catch (Exception e) { 
                System.out.println("Error en el formato numérico, vuelve a introducir un valor."); 
                correcto = false; 
            }
        } while (correcto == false);
        return num; 
    } 

    // Función pideDouble
    // Objetivo: Pedir un número decimal al usuario y asegurar que se encuentre dentro del rango [min, max]
    // Parámetros:
    // - mensaje: Mensaje que se mostrará al usuario antes de solicitar el número
    // - min: Límite inferior del rango
    // - max: Límite superior del rango
    public static double pideDouble(String mensaje, double min, double max) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        boolean correcto;
        double num = 0;
        do { 
            correcto = true; 
            try { 
                do { 
                    System.out.println(mensaje); 
                    String valor = br.readLine(); 
                    num = Double.parseDouble(valor); 
                } while (num < min || num > max); 
            } catch (Exception e) {
                System.out.println("Error en el formato numérico, vuelve a introducir un valor.");
                correcto = false; 
            }
        } while (correcto == false);
        return num;
    } 
}