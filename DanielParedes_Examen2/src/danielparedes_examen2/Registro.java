
package danielparedes_examen2;

public class Registro {

    public static void main(String[] args) 
    {
        int a,b,c,d;
        TransporteLigero tl= new TransporteLigero();
        TransporteMasivo tp= new TransporteMasivo();
        TransporteCarga tc= new TransporteCarga();
        Cobranza cb=new Cobranza();
       do
        {
            System.out.println("Señor usuario elija una accion: ");
            System.out.println("1. Ingresar un vehiculo personal: ");
            System.out.println("2. Ingresar un vehiculo de carga: ");
            System.out.println("3. Ingresar un vehiculo de transporte masivo: ");
            System.out.println("4. Imprimir valores de un tipo especifico: ");
            System.out.println("5. Imprimir el valor general: ");
            System.out.println("6. Mostrar todos los valores: ");
            System.out.println("7. Mostrar todos los medios de transporte");
            System.out.println("0. Salir");
            a=Leer.datosInt();
            switch(a)
            {
                case 1:
                {
                    System.out.println("Ingrese el numero de vehiculos");
                    b=Leer.datosInt();                                             
                    tl.LeerDatos(b);
                    tl.ElejirTipo(b);
                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese el numero de vehiculos");
                    c=Leer.datosInt();                                             
                    tp.LeerDatos(c);
                    tp.ElejirTipo(c);

                    break;
                }
                case 3:
                {
                    System.out.println("Ingrese el numero de vehiculos");
                    d=Leer.datosInt();                                             
                    tc.LeerDatos(d);
                    tc.ElejirTipo(d);
                    break;
                }
                case 4:
                {
                    System.out.println("ingrese 1 para transportes livianos");
                    System.out.println("ingrese 2 para transportes pesados");
                    System.out.println("ingrese 3 para transportes carga");
                    int n=Leer.datosInt();
                    cb.Cobrar(n, tp, tc, tl);
                    break;
                }
                case 5:
                {
                    cb.Cobrar(4, tp, tc, tl);
                    break;
                }
                case 6:
                {
                    for (int i = 0; i < 5; i++)                                 
                        cb.Cobrar(i, tp, tc, tl);
                    break;
                }
                case 7:
                {
                    System.out.println("Transporte personal"+tl.getNumero());
                    tc.MostrarDatos(tl.getNumero());
                    System.out.println("Transporte masivo");
                    tc.MostrarDatos(tl.getNumero());
                    System.out.println("Transporte de carga");
                    tc.MostrarDatos(tc.getNumero());
                    break;
                }
            }
        }while (a!=0);
    }
    
}
