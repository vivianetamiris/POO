public class DescontoBlackFriday implements Desconto {
    public double aplicar(double valor) {
        return valor * 0.7;
    }
}