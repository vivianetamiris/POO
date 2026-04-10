public class JogoMemoria {

    public static void main(String[] args) {

        // Garante que a interface gráfica rode corretamente
        javax.swing.SwingUtilities.invokeLater(() -> {

            // Cria a lógica do jogo
            Logica logica = new Logica();

            // Cria o ranking
            Ranking ranking = new Ranking();

            // Cria a interface e conecta tudo
            new Interface(logica, ranking);
        });
    }
}