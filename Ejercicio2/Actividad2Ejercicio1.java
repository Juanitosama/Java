import java.io.*;

public class Actividad2Ejercicio1 {
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int [] num = new int[7]; //Declaramos la variable num como un array de N numero de valores INT
        int i = 0; //Declaramos las variables como numeros enteros y decimales
        int contar;
        double acumulador;
        double media;
        int Maximo;
        int opcion;

        System.out.println("Se deben introducir 7 numeros entre 10 y 50.");
        for (i=0; i < 7; i++) //Realizamos un bucle for para introducir 7 numeros
        {
            do
            {
                System.out.println("Introduzca el " + ( i + 1 ) +"º numero:");
                num[i] =Integer.parseInt(br.readLine());
            }
            while ( num[i] < 10 || num[i] > 50 ); //Si el numero introducido es menor de 10 o mayor de 50 no lo acepta
        }
        for (i=0; i < 7; i++) //Realizamos un bucle para mostrar el contenido del array y su numero en la lista
        {
            System.out.println(( i + 1 ) + "º numero es: " + num[i]);
        }
        do 
        {
            // REALIZAR UN MENU
            System.out.println("0.-FINALIZAR");	
            System.out.println("1.-NUMERO DE VALORES ENTRE 22 Y 32 DEL ARRAY");
            System.out.println("2.-MEDIA ARITMETICA DE LOS 7 NUMEROS DEL ARRAY");
            System.out.println("3.-NUMERO MAS ALTO DEL ARRAY");
            System.out.println("4.-PRIMERA Y ULTIMA POSICION DEL ARRAY");
            System.out.println("ESCOJE OPCION:");
            opcion=Integer.parseInt(br.readLine());
            switch(opcion)
            {
            case 1: //NUMERO DE VALORES ENTRE 22 y 32:
            contar = 0;
            for (i = 0; i < 7; i++)
                {
                    if (num[i] >= 22 && num[i] <= 32) //Si el numero es >= a 22 y <= a 32 cuenta ++ en el contador sino no, asi muestra los numeros entre el 22 y 32
                    {
                    contar ++;
                    }
                }
                System.out.println("El numero de valores entre 22 y 32 es:"+ contar);
                break;
            case 2://MEDIA DE LOS 7 NUMEROS
            acumulador = 0;
            media = 0;
            for ( i= 0; i < 7; i++ )
                {
                    acumulador = acumulador + num[i]; //Hace un bucle pasando por toda la array, y los va sumando
                }
                    media = acumulador/7; //Media de los 7 numeros
                    System.out.println("La media aritmética de los 7 numeros es: " + media);
                break;
            case 3://NUMERO MAS ALTO
            Maximo = 0;
            for ( i = 0; i < 7; i++ )
                {
                    if  (num[i] > Maximo) //Se inicia en 0 y cada vez que en el bucle aparezca un numero mayor al que tenemos guardado, cambia la variable a ese numero
                    {
                        Maximo = num[i];
                    }
                }
                System.out.println("El número mas grande es: " + Maximo);
                break;
            case 4: // PRIMERA Y ULTIMA POSICION
                System.out.println("El primer numero es: " + num[0]); //Primera posicion del array
                System.out.println("El último numero es: " + num[6]); //Última posicion del array
                break;
            case 0: //Salir
                break;
            }
        }while (opcion !=0); //Si eliges otra opcion que no sea ninguno de los cases, vuelve a pedir numero, si pones 0 cierra el programa.
        }
    }

