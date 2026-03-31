import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void realizarEmprestimo(Livro livro, Leitor leitor, String dataEmprestimo, String dataDevolucao) {
        Emprestimo e = new Emprestimo();
        e.setLivro(livro);
        e.setLeitor(leitor);
        e.setDataEmprestimo(dataEmprestimo);
        e.setDataDevolucao(dataDevolucao);

        emprestimos.add(e);
    }

   
    }

