public class Circulo extends Figura {
    double radio;
    public Circulo(String tipo, double radio) {
        super(tipo);
        this.radio = radio;
    }
    @Override
    public double area() {
        return  (Math.PI * this.radio * this.radio);
    }
}