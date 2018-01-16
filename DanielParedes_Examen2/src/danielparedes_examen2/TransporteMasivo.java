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
public class TransporteMasivo extends Transporte
{
    int numero;
    public void ElejirTipo(int a)
    {
        setNumero(a);
        for (int i = 0; i < a; i++) 
        {
            System.out.println("Ingrese los datos del vehiculo: "+i);
            int c;
            System.out.println("Señor usuario: Digite 1 para bus; o 2 para furgoneta");
            c=Leer.datosInt();
            while((0<c)&&(c>3))
            {
                System.out.println("Ingrese un dato valido");   
                c=Leer.datosInt();
            }
            if(c==1)
            {
            }
                tipo[i]="bus";
                ejes[i]=3;
            if(c==2)
            {
                tipo[i]="furgoneta";
                ejes[i]=2;
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
