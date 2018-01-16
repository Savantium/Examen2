package examen2;

import java.util.Scanner;

/**
 *
 * @author DennisBolaños
 */
public class GestionarCircuito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a;
        do
        {
            System.out.println("Señor usuario elija una opcion: ");
            System.out.println("1. Ingresar.");
            System.out.println("2. Eliminar.");
            System.out.println("3. Mostrar.");
            System.out.println("4. Salir.");
            a=sc.nextInt();
            while((a<1)&&(a>5))
            {
                System.out.println("Opcion invalida...");
                a=Leer.datosInt();
            }
            switch(a)
            {
                case 1:
                {
                    break;
                }
                case 2:
                {
                    break;
                }
                case 3:
                {
                    break;
                }
            }
            
        }while (a!=4);
               
    }
    
}
