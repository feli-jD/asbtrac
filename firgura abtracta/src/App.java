public class App {
    public static void main(String[] args) throws Exception {
        Figura triangulo = new Triangulo(null, 10, 5);
        Figura cuadrado = new Cuadrado(null, 200);
        Figura circulo = new Circulo(null, 343);
        Figura rectangulo = new Rectangulo(null, 50, 84);
        System.out.println(triangulo.area());
        System.out.println(cuadrado.area());
        System.out.println(circulo.area());
        System.out.println(rectangulo.area());
    }
}
