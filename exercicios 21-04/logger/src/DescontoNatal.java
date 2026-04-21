public class DescontoNatal implements Desconto {
    public double aplicar(double valor) {
        return valor * 0.8;
    }
}