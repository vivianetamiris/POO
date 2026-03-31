import java.util.ArrayList;

public class PedidoCompra {

    private int numero;
    private String data;
    private ArrayList<ItemPedido> itens;

    public PedidoCompra() {
        itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void adicionarItem(String produto, int quantidade, double preco) {
        ItemPedido item = new ItemPedido();
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setPreco(preco);

        itens.add(item);
    }

    public void listarItens() {
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto() + " - " +
            item.getQuantidade() + " - " +
            item.getPreco());
        }
    }
}