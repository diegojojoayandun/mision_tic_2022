
package reto2;

/**
 *
 * @author dev
 */
public class ComputadoresMesa extends Computadores{
    
    private final static Integer ALMACENAMIENTO_BASE = 50;
    private Integer almacenamiento;
    
    public ComputadoresMesa() {
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }
    
    public ComputadoresMesa(double precioBase, Integer peso){
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }
    
    public ComputadoresMesa (double precioBase, Integer peso, char consumoW, Integer almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }
    
    // Methods
    
    
    @Override
    public double calcularPrecio(){
        double plus = super.calcularPrecio();
        
        if (almacenamiento > 100.0) {
            plus += 50.0;
        }
        
        return plus;
        
    }
    
}
