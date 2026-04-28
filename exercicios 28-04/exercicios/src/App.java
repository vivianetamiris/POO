public class App {

    public static void main(String[] args) {

        
        // 1
        EstacaoClimatica estacao = new EstacaoClimatica();
        DisplayConsole display = new DisplayConsole();
        estacao.adicionarObservador(display);
        estacao.atualizarMedicoes(25.0f, 60.0f, 1013.0f);

        // 2
        RelatorioTemplate relatorioPDF = new RelatorioPDF();
        relatorioPDF.gerar();
        RelatorioTemplate relatorioCSV = new RelatorioCSV();
        relatorioCSV.gerar();

        // 3
        CalculavelArea area = new AdaptadorAreaRetangulo(5, 10);
        System.out.println("Área: " + area.calcularArea());

        // 4
        ItemSanduiche sanduiche = new SanduicheSimples();
        sanduiche = new AdicionalQueijo(sanduiche);
        sanduiche = new AdicionalTomate(sanduiche);
        sanduiche = new AdicionalBacon(sanduiche);
        System.out.println(sanduiche.descricao());
        System.out.println("Preço: " + sanduiche.preco());
    }
}