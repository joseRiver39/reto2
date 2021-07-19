import java.util.*;

public class FinanzasP {
    //Propiedades
    HashMap<String, Integer> carteraAhorros = new HashMap<String, Integer>();
       //Contiene: Efectivo, Electronico
    HashMap<String, Integer> gastosFijos = new HashMap<String, Integer>(); 
         //Por ejemplo: servicios, alimentacion,...
    HashMap<String, Integer> gastos = new HashMap<String, Integer>();  
             //Por ejemplo: ropa, salidas, etc.
    int efectivo2=0;
    int electronico2=0;  
    int gastosFijos2=0;
    int gasto2=0;

    public int utilidades () {  //6. Consulta de capital de inversion

    
    
        int utilidad = (efectivo2+electronico2)-(gasto2+gastosFijos2);
        //Calcula el dinero disponible para inversion

        return utilidad;
    }

    public HashMap<String, Integer> movimientosF() {    //7. Movimientos financieros
        //Resumen de movimientos financieros



        HashMap<String, Integer> mov = new HashMap<String, Integer>(){{
           put("Ingresos", 0);
           put("Egresos", 0);
        }};
        mov.put("Ingresos",efectivo2 +electronico2);
        mov.put("Egresos",gasto2 +gastosFijos2 );
       // mov.put("ingresos",carteraAhorros.get("efectivo")+carteraAhorros.get("Electronico"));

        //mov.put("egreso",gastosFijos.getNombre()-gastos.getNombre());
        //---calculo de ingresos y egresos---

        return mov;
    }

    public int[] ConsultarCartera() {   //5. Consulta de liquidez

   

        int[] dinero = {0,0}; 
        //[Efectivo, electronico]
        //---Tu desarrollo---
        //System.out.print("carteraAhorros" + carteraAhorros);
       /// System.out.print("gastosFijos" + gastosFijos);
       // System.out.print("gastos" + gastos);

        dinero[0]=carteraAhorros.get("Efectivo");
        dinero[1]=carteraAhorros.get("Electronico");
        return dinero;
    }

    public void gasto(String nombre, int valor) {
        gasto2= gasto2 + valor; 
        gastos.put(nombre, gasto2);
    }

    public void registrarFijos(String nombre, int valor) {
        gastosFijos2 = gastosFijos2 + valor;   
        gastosFijos.put(nombre, gastosFijos2);
    }

    public void Efectivo(int efectivo) {


        efectivo2 =efectivo2 + efectivo; 

        carteraAhorros.put("Efectivo", efectivo2);
    }

    public void EfElectronico(int efectivo) {
        electronico2= electronico2+ efectivo;     
        carteraAhorros.put("Electronico", electronico2);
    }
}
