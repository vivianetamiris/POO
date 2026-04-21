public class App {

    public static void main(String[] args) throws Exception {

        // LOGGER
        Logger logger = Logger.getInstance();
        logger.log("Sistema iniciado");

        // FACTORY
        FormaGeometrica forma = FabricaForma.criarForma("circulo");
        forma.desenhar();

        // STRATEGY
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.setTotal(100);
        carrinho.setDesconto(new DescontoBlackFriday());
        System.out.println("Total com desconto: " + carrinho.calcularTotal());

        // BUILDER
        Pizza pizza = new Pizza.Builder("Grande")
                .setQueijoExtra(true)
                .setBordaRecheada(true)
                .build();

        pizza.mostrar();
    }
}