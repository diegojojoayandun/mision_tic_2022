
package reto2;


public class Computadores {
    
    // Default CONST
    protected final static char CONSUMO_W = 'F';
    protected final static double PRECIO_BASE = 100.0;
    protected final static Integer PESO_BASE = 5;
    
    
    protected Integer peso;
    protected char consumoW;
    protected double precioBase;
    
    // Constructors
    
    public Computadores(){
        
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W;
        this.precioBase = PRECIO_BASE;
    }
    
    public Computadores(double precioBase, Integer peso){
        this.peso = peso;
        this.consumoW = CONSUMO_W;
        this.precioBase = precioBase;
    }
    
    public Computadores(double precioBase, Integer peso, char consumoW){
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }
    
    //Methods
    
    public double calcularPrecio(){
        double plus = 0.0;
        
        switch (consumoW){
        
            case 'A':
                plus += 100.0;
                break;
            case 'B':
                plus += 80.0;
                break;
            case 'C':
                plus += 60.0;
                break;
            case 'D':
                plus += 50.0;
                break;
            case 'E':
                plus += 30.0;
                break;
            case 'F':
                plus += 10.0;
                break;
        
        }
        
        if (peso >= 0 && peso < 19){
            plus += 10.0;
        } else if (peso >= 20 && peso < 49) {
            plus += 50.0;
        } else if (peso >= 50 && peso < 79){
            plus += 80.0;
        } else if (peso >= 80){
            plus += 100.0;
        }
        
        
        return precioBase + plus;
        
    }

    public Integer getPeso() {
        return peso;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    
    
    
    
    
    
}
