import java.io.*;

public class Filtro
{
    public static int pideEntero()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedInputStream br=new BufferedInputStream(isr);
        int num;
        System.out.println("Introduce número entero: ");
        num = Integer.parseInt(br.readLine());
        return num1;
    }//Cierra pideEntero
    public static double pideDouble()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedInputStream br=new BufferedInputStream(isr);
        double num2;
        System.out.println("Introduce número decimal: ");
        num = double.parsedouble(br.readLine());
        return num2;
    }//Cierra pideDouble
}//Ej3
