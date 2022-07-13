
package reto2;

/**
 *
 * @author dev
 */
public class ComputadoresPortatil extends Computadores{
    
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;
    
    // constructores
    
    public ComputadoresPortatil(){
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }
    
    public ComputadoresPortatil(double precioBase, Integer peso){
        super(precioBase, peso);
        this.consumoW = CONSUMO_W;
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }
    
    public ComputadoresPortatil(double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }
    
    // methods
    
    @Override
    public double calcularPrecio(){
        double plus = super.calcularPrecio();
        if (pulgadas > 40){
            plus += precioBase * 0.3;
        }
        
        if (camaraITG){
            plus += 50.0;
        }
        return plus;
    }
    
}
