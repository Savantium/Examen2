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
public class TransporteLigero extends Transporte 
{
    int numero;
    public void ElejirTipo(int a)
    {
        setNumero(a);
        for (int i = 0; i < a; i++)
        {
            System.out.println("Ingrese los datos del vehiculo: "+i);
            int ex;
                System.out.println("Señor usuario: Digite 1 para motocicleta; o 2 para automovil");
            ex=Leer.datosInt();
            while((0<ex)&&(ex>3))
            {
                System.out.println("Ingrese un dato valido");        
                ex=Leer.datosInt();
            }
            if(ex==1)
            {
                tipo[i]="motocicleta";
                ejes[i]=1;
            }
            if(ex==2)
            {
                tipo[i]="automovil";
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
