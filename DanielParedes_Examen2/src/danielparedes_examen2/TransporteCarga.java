/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielparedes_examen2;

/**
 *
 * @author MNG
 */
public class TransporteCarga extends Transporte{
    
    int[] capacidad;
    int numero;
    public void ElejirTipo(int a)
    {
        capacidad=new int[a];
        setNumero(a);
        for (int i = 0; i < a; i++)
        {
        System.out.println("Ingrese los datos del vehiculo: "+i);
        int c;
            System.out.println("Señor usuario: Digite 1 para trailer, 2 para camioneta, o 3 para camion");
            c=Leer.datosInt();
            while((0<c)&&(c>4))                
            {
                System.out.println("Ingrese un dato valido");        
                c=Leer.datosInt();
            }
            
            if(c==1)
            {
                tipo[i]="trailer";
                ejes[i]=4;
                System.out.println("Ingrese la capacidad: ");
                capacidad[i]=Leer.datosInt();
            }
            if(c==2)
            {
                tipo[i]="camioneta";
                ejes[i]=2;
                System.out.println("Ingrese la capacidad: ");
                capacidad[i]=Leer.datosInt();
            }
            if(c==2)
            {
                tipo[i]="camion";
                ejes[i]=3;
                System.out.println("Ingrese la capacidad: ");
                capacidad[i]=Leer.datosInt();
            }    
        }
        
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
