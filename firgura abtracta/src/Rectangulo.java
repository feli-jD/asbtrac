public class Rectangulo extends Figura {
    double base, altura;
    public Rectangulo(String tipo, double base, double altura) {
     super(tipo);
     this.base =base;
     this.altura = altura;
     }

     @Override
     public double area(){
     return(double) (this.base*this.altura);
     }
}
