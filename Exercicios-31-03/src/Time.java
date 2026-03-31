import java.util.ArrayList;
public class Time {

    private String nomeTime;
    private ArrayList<Jogador> jogadores;

    public Time() {
        jogadores = new ArrayList<>();
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        for (Jogador j : jogadores) {
            System.out.println(j.getNome());
        }
    }
}