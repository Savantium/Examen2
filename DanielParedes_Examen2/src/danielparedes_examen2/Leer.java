package danielparedes_examen2;


import java.io.*;



public class Leer {
    public static String datosString(){
        String texto= null;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            texto= br.readLine();
        } catch (IOException ex) {
            System.err.println("Elija una opcion valida..."+ex.getMessage());  
        }
        return texto;
    }
    public static int datosInt(){
        try 
        {
            return Integer.parseInt(datosString());
        } catch (NumberFormatException ex) {
            System.err.println("ERROR..."+ex.getMessage());  
        }
        return Integer.MIN_VALUE;
    }
    public static float datosFloat(){
        try {
            return Float.parseFloat(datosString());
        } catch (NumberFormatException ex) {
            System.err.println("ERROR..."+ex.getMessage());  
        }
        return Float.MAX_VALUE;
    }
 
}
