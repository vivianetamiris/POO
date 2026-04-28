public class AdaptAreaRetangulo implements CalculavelArea {

    private CalcAreaRetangulo calculadora;
    private double largura;
    private double altura;

    public AdaptAreaRetangulo(double largura, double altura) {
        this.calculadora = new CalcAreaRetangulo();
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return calculadora.calcular(largura, altura);
    }
}