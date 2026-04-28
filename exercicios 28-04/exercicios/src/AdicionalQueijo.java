public class AdicionalQueijo extends AdicionalSanduiche {

    public AdicionalQueijo(ItemSanduiche item) {
        super(item);
    }

    public String descricao() {
        return item.descricao() + ", Queijo";
    }

    public double preco() {
        return item.preco() + 8.0;
    }
}