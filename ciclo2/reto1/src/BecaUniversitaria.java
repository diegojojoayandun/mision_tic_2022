public class BecaUniversitaria {

    // atributos privados de la clase
    // BecaUniversitaria
    private Integer tiempo = 0;
    private double monto = 0;
    private double interes = 0;

    // constructor clase sobrecarga
    // inicializa los valores cuando se pasan como parametro a la clase
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
    }

    // Constructoer de la clase cuandoi no se pasan parametros
    public BecaUniversitaria(){
    }

    // metodo que retorna el valor del interes simple
    public double calcularInteresSimple(){
        double  total = monto * (interes/100) * tiempo;
        return Math.round((total));
    }

    // metodo que retorno el interes compuesto
    public double calcularInteresCompuesto(){
        double total = monto * (Math.pow(1 + (interes/100), tiempo) -1);
        return Math.round(total);
    }

    // metodo que recibe los valores de tiempo, monto e interes y los usa si no se inicializan en el constructor
    // caso contrario se toman los valores por fdefault de los atributos privados de la clase.
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;

        double resultado;
        resultado = calcularInteresCompuesto() - calcularInteresSimple();
        double total = Math.round(resultado);
        return String.format("La diferencia entre la proyección de interés compuesto e interés simple es: $%.1f", total);
    }

    public String compararInversion (){
        if (this.interes == 0 || this.tiempo == 0 || this.monto == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        } else {
            return this.compararInversion(tiempo, monto, interes);
        }
    }
    public static void main(String[] args) throws Exception {
        BecaUniversitaria mibeca = new BecaUniversitaria(48,10000,2.0);
        System.out.println(mibeca.calcularInteresSimple());
        System.out.println(mibeca.calcularInteresCompuesto());
        System.out.println(mibeca.compararInversion());
    }
}



