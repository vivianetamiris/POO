public class AdicionalTomate extends AdicionalSanduiche {

    public AdicionalTomate(ItemSanduiche item) {
        super(item);
    }

    public String descricao() {
        return item.descricao() + ", Tomate";
    }

    public double preco() {
        return item.preco() + 3.5;
    }
}