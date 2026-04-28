public class AdicionalBacon extends AdicionalSanduiche {

    public AdicionalBacon(ItemSanduiche item) {
        super(item);
    }

    public String descricao() {
        return item.descricao() + ", Bacon";
    }

    public double preco() {
        return item.preco() + 8.5;
    }
}