public class Cuadrado extends Figura {
    double base;
    public Cuadrado(String tipo, double base) {
        super(tipo);
         this.base = base;   
    }
    @Override
    public double area() {
        return (double) (this.base * this.base);
    }
}