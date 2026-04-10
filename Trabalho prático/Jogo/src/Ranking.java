import java.util.*;

public class Ranking {

    class Jogador {
        String nome;
        int pontos;

        Jogador(String nome, int pontos) {
            this.nome = nome;
            this.pontos = pontos;
        }
    }

    ArrayList<Jogador> lista = new ArrayList<>();

    public void salvar(int pontos) {

        String nome = javax.swing.JOptionPane.showInputDialog("Digite seu nome:");

        if (nome != null && !nome.isEmpty()) {
            lista.add(new Jogador(nome, pontos));
        }

        lista.sort((a, b) -> b.pontos - a.pontos);
    }

    public String getRanking() {

        String texto = "🏆 Ranking:\n\n";

        for (int i = 0; i < lista.size(); i++) {
            Jogador j = lista.get(i);
            texto += (i + 1) + "º - " + j.nome + " (" + j.pontos + " pts)\n";
        }

        return texto;
    }
}