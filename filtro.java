import java.io.*;
public class Filtro
{
    public static int pideEntero(String mensaje, int min,int max)throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedInputStream br=new BufferedInputStream(isr);
        boolean correcto;
        int num = 0;
        do{
            correcto = true;
        try{//  control de errores
            do{
                System.out.println(mensaje);
                num = Integer.parseInt(br.readLine());
            }while (num < 5||num > 10);
        }catch(Exception e) 
            {
            System.out.println("Error en el formato numérico, vuelve a introducir un valor.");
            correcto = false;
            }
        }while(correcto == false);
        return num;
    }//Cierra pideEntero
    public static double pideDouble(String mensaje, int min, int max)throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedInputStream br=new BufferedInputStream(isr);
        boolean correcto;
        double num = 0;
        do{
            correcto = true;
        try{//Control de errores
            do{
                System.out.println("Introduce número decimal: ");
                String valor2 = br.readLine();
                num = Double.parseDouble(valor2);
            }while(num<0 || num>10);
        }catch(Exception e)
            {
                System.out.println("Error en el formato numérico, vuelve a introducir un valor.");
                correcto = false;
            }
        }while (correcto == false);
        return num;
    }//Cierra pideDouble
}//Ej3
