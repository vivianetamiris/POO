public class CarrinhoCompras {

    private double total;
    private Desconto desconto;

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotal() {
        return desconto.aplicar(total);
    }
}