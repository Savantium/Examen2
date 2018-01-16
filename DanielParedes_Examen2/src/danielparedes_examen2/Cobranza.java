package danielparedes_examen2;

public class Cobranza
{
    public void Cobrar(int a, TransporteMasivo tp, TransporteCarga tc, TransporteLigero tl)
    {
        int ip;
        int ie;
        int it;
            switch(a)
            {
                case 1:
                {
                    ip=0;
                    ie=0;
                    for (int i = 0; i < tl.getNumero(); i++) 
                    {
                        ip=ip+10;
                        ie=ie+(5*tl.ejes[i]);
                    }
                    it=ip+ie;
                    System.out.println("El impuesto por ejes es: "+ie+" el impuesto por dueño es: "+ip+" y el impuesto total es: "+it);
                    break;
                }
                case 2:
                {
                    ip=0;
                    ie=0;
                    for (int i = 0; i < tp.getNumero(); i++) 
                    {
                        ip=ip+5;
                        ie=ie+(5*tp.ejes[i]);
                    }
                    it=ip+ie;
                    System.out.println("El impuesto por ejes es: "+ie+" el impuesto por dueño es: "+ip+" y el impuesto total es: "+it);
                    break;
                }
                case 3:
                {
                    ip=0;
                    ie=0;
                    for (int i = 0; i < tc.getNumero(); i++) 
                    {
                        ip=ip+15;
                        ie=ie+(5*tc.ejes[i]);
                    }
                    it=ip+ie;
                    System.out.println("El impuesto por ejes es: "+ie+" el impuesto por dueño es: "+ip+" y el impuesto total es: "+it);
                    
                    break;
                }
                case 4:
                    int itt, itc, itm;
                    ip=0;
                    ie=0;
                    for (int i = 0; i < tl.getNumero(); i++) 
                    {
                        ip=ip+10;
                        ie=ie+(5*tl.ejes[i]);
                    }
                    it=ip+ie;
                    ip=0;
                    ie=0;
                    for (int i = 0; i < tp.getNumero(); i++) 
                    {
                        ip=ip+10;
                        ie=ie+(5*tp.ejes[i]);
                    }
                    itm=ip+ie;
                    ip=0;
                    ie=0;
                    for (int i = 0; i < tc.getNumero(); i++) 
                    {
                        ip=ip+10;
                        ie=ie+(5*tc.ejes[i]);
                    }
                    itc=ip+ie;
                    itt=it+itc+itm;
                    System.out.println("El valor total es: "+itt+" del cual: ");
                    System.out.println(it+" es de transporte personal");
                    System.out.println(itm+" es de transporte masivo");
                    System.out.println(itc+" es de transporte carga");
                    
                    break;
                }
            }
    }

