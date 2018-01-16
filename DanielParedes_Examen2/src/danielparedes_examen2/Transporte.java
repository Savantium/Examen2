/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielparedes_examen2;

public class Transporte
{
    protected int[] matricula;
    protected String[] dueño;
    protected String[] placas;
    protected int[] pasajeros;
    protected String[] tipo;
    protected int[] ejes;
    protected String[] marca;
    protected String[] modelo;
    
    public void LeerDatos(int a)
    {
        matricula=new int[a];
        pasajeros=new int[a];
        ejes=new int[a];
        dueño=new String[a];
        placas=new String[a];
        tipo=new String[a];
        marca=new String[a];
        modelo=new String[a];
        
        for (int i = 0; i < a; i++) 
        {         
            System.out.println("Ingrese los datos del vehiculo: "+i);
        System.out.print("Señor usuario ingrese la matricula: ");
        matricula[i]=Leer.datosInt();
        System.out.print("Señor usuario ingrese la marca: ");
        marca[i]=Leer.datosString();
        System.out.print("Señor usuario ingrese el modelo: ");
        modelo[i]=Leer.datosString();
        System.out.print("Señor usuario ingrese el propietario: ");
        dueño[i]=Leer.datosString();
        System.out.print("Señor usuario ingrese las placas: ");
        placas[i]=Leer.datosString();
        System.out.print("Señor usuario ingrese el numero de pasajeros: ");
        pasajeros[i]=Leer.datosInt();
        }
    }
    public void MostrarDatos(int a)
    {
        for(int i=0; i<a ;i++)
        {
            System.out.print("El vehiculo: "+getModelo()[i]+" "+getMarca()[i]+" es del propietario: "+getDueño()[i]);
            System.out.print(" es del tipo: "+getTipo()[i]+" tiene: "+getEjes()[i]+" ejes y capacidad para: "+getPasajeros()[i]+" pasajeros");
            System.out.println("");
        }
    }

    /**
     * @return the matricula
     */
    public int[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int[] matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the dueño
     */
    public String[] getDueño() {
        return dueño;
    }

    /**
     * @param dueño the dueño to set
     */
    public void setDueño(String[] dueño) {
        this.dueño = dueño;
    }

    /**
     * @return the placas
     */
    public String[] getPlacas() {
        return placas;
    }

    /**
     * @param placas the placas to set
     */
    public void setPlacas(String[] placas) {
        this.placas = placas;
    }

    /**
     * @return the pasajeros
     */
    public int[] getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * @return the tipo
     */
    public String[] getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ejes
     */
    public int[] getEjes() {
        return ejes;
    }

    /**
     * @param ejes the ejes to set
     */
    public void setEjes(int[] ejes) {
        this.ejes = ejes;
    }

    /**
     * @return the marca
     */
    public String[] getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String[] marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String[] getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String[] modelo) {
        this.modelo = modelo;
    }
}
