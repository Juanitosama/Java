import java.io.*;

public class Actividad2Ejercicio2 {
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double [][] m = {{1.2, 4.5, 6.7, 5.6}, {8.9, 4.9, 2.3, 6.8},{5.7, 5.9, 7.8, 9.6}}; //Declaramos la matriz con 3 columnas y 4 filas
        int i = 0;
        int u = 0;
        double suma;
        double media;
        double minimo;

        //Todas las puntuaciones del array:
        System.out.println("Puntuaciones del primer experto: ");
        for(i = 0; i < 3; i++)
        {
        System.out.println ((i + 1 ) + ("º canción: ") + (m[i][0]));
        }
        System.out.println("Puntuaciones del segundo experto: ");
        for(i = 0; i < 3; i++)
        {
        System.out.println ((i + 1 ) + ("º canción: ") + (m[i][1]));
        }
        System.out.println("Puntuaciones del tercer experto: ");
        for(i = 0; i < 3; i++)
        {
        System.out.println ((i + 1 ) + ("º canción: ") + (m[i][2]));
        }

        //PUNTUACIONES DEL PRIMER EXPERTO
        System.out.println("Puntuaciones del primer experto:");

        for(i = 0; i < 3; i++)
        {
        System.out.println (("La puntuación del primer experto de la ")+ (i + 1 ) + ("º canción es: ") + (m[i][0]));
        }

        //MEDIA OBTENIDA DE LA SEGUNDA CANCION
        suma = 0;
        media = 0;
        for ( u = 0; u < 4; u++)
        {
            suma = suma + m[1][u];
        }
            media = suma/4;
        System.out.println("Esta es la media aritmética de la segunda canción: " + media);

        //PEOR VALORACIÓN DE LA TERCERA CANCIóN
        minimo = 10;
        for (u = 0; u < 4 ; u++)
        {
            if (m[2][u] < minimo)
            {
                minimo = m[2][u];
            }
        }
        System.out.println("Esta es la peor valoración de los expertos en la tercera canción: " + minimo);
    }
}