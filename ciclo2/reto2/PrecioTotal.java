
package reto2;

public class PrecioTotal {
    private double totalComputadores = 0.0;
    private double totalComputadoresPortatil = 0.0;
    private double totalComputadoresMesa = 0.0;
    private final Computadores[] listaComputadores;
    
    // Contructor
    
    public PrecioTotal(Computadores[] pComputadores){
        this.listaComputadores = pComputadores;
    }
    
    public void mostrarTotales(){
        for (int i = 0; i < listaComputadores.length; i++){
            if (listaComputadores[i] instanceof Computadores){
                totalComputadores += listaComputadores[i].calcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresMesa){
                totalComputadoresMesa += listaComputadores[i].calcularPrecio();
            }
            if (listaComputadores[i] instanceof ComputadoresPortatil){
                totalComputadoresPortatil += listaComputadores[i].calcularPrecio();
            }
        }
        
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores portatiles es de " + totalComputadoresPortatil);
        
        
    }
    
}
