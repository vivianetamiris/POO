public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("--------Cliente-Pedidos----------");
        Cliente c1 = new Cliente();
        c1.setNome("Viviane");
        c1.setCpf("123456789");

        Pedido p1 = new Pedido();
        p1.setNumero(1);
        p1.setCliente(c1);

        System.out.println(p1.getCliente().getNome());


        System.out.println("--------Time-Jogadores----------");
        Time time = new Time();
        time.setNomeTime("Palmeiras");

        Jogador j1 = new Jogador();
        j1.setNome("Gustavo Gomez");

        Jogador j2 = new Jogador();
        j2.setNome("Vitor Roque");

        time.adicionarJogador(j1);
        time.adicionarJogador(j2);

        time.listarJogadores();

       
        System.out.println("--------Agenda-Contatos----------");
        Agenda agenda = new Agenda();
        agenda.setNomeAgenda("Pessoal");

        Contato ct1 = new Contato();
        ct1.setNome("Maria");
        ct1.setTelefone("99999-9999");

        Contato ct2 = new Contato();
        ct2.setNome("João");
        ct2.setTelefone("88888-8888");

        agenda.adicionarContato(ct1);
        agenda.adicionarContato(ct2);

        agenda.listarContatos();
       

        System.out.println("--------Pedido de Compra----------");
        PedidoCompra p = new PedidoCompra();

        p.setNumero(2);
        p.setData("30/03/2026");

        p.adicionarItem("Arroz", 2, 5.50);
        p.adicionarItem("Feijão", 1, 7.00);

        p.listarItens();

        System.out.println("--------Biblioteca----------");

        Autor autor = new Autor();
        autor.setNome("J. R. R. Tolkien");

        Livro livro = new Livro();
        livro.setTitulo("O Hobbit");
        livro.setAutor(autor);
        livro.setAno(1937);

        Leitor leitor = new Leitor();
        leitor.setNome("Viviane");
        leitor.setMatricula(666);

        Biblioteca b = new Biblioteca();
        b.setNome("Biblioteca Central");

        b.adicionarLivro(livro);

        b.realizarEmprestimo(livro, leitor, "01/04/2026", "10/04/2026");

    }
}
    
