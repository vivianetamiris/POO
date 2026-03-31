import java.util.ArrayList;

public class Agenda {

    private String nomeAgenda;
    private ArrayList<Contato> contatos;

    
    public Agenda() {
        contatos = new ArrayList<>();
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        for (Contato c : contatos) {
            System.out.println(c.getNome() + " - " + c.getTelefone());
        }
    }
}