import java.util.Scanner;
public class Main {   
    public static void main(String[] args) throws Exception {

         System.out.println("ATIVIDADE 1");
        Produto p1 = new Produto();
        p1.setNome("Mouse");
        p1.setPreco(50.0);

        Produto p2 = new Produto();
        p2.setNome("Teclado");
        p2.setPreco(120.0);

        System.out.println(p1.getNome() + " - R$" + p1.getPreco());
        System.out.println(p2.getNome() + " - R$" + p2.getPreco());

        System.out.println("---------------------------");

         System.out.println("ATIVIDADE 2");
        Aluno a1 = new Aluno();
        a1.setNome("Amanda");
        a1.setNota(8.5);

        Aluno a2 = new Aluno();
        a2.setNome("Breno");
        a2.setNota(7.0);

        Aluno a3 = new Aluno();
        a3.setNome("Daniela");
        a3.setNota(9.2);

        System.out.println(a1.getNome() + " - Nota: " + a1.getNota());
        System.out.println(a2.getNome() + " - Nota: " + a2.getNota());
        System.out.println(a3.getNome() + " - Nota: " + a3.getNota());

        System.out.println("---------------------------");

         System.out.println("ATIVIDADE 3");
        Produto p3 = new Produto("Mouse", "Informática");
        Produto p4 = new Produto(99.90);

        System.out.println("Produto 3: " + p3.getNome() + " - " + p3.getCategoria());
        System.out.println("Produto 4: Preço = R$" + p4.getPreco());
        System.out.println("---------------------------");

        System.out.println("ATIVIDADE 4");
        Carro c1 = new Carro(); 
        Carro c2 = new Carro("Toyota", 2022); 

        System.out.println(c2.getMarca() + " - " + c2.getAno());
        System.out.println("---------------------------");

        System.out.println("ATIVIDADE 5");
        Pessoa ps = new Pessoa();

        ps.setNome("Viviane");
        ps.setIdade(35);

        System.out.println(ps.getNome());
        System.out.println(ps.getIdade());
        System.out.println("---------------------------");

        System.out.println("ATIVIDADE 6");
        Pessoa ps2 = new Pessoa("Carlos", 25);
        System.out.println(ps2.getNome());
        System.out.println(ps2.getIdade());

        System.out.println("---------------------------");

        System.out.println("ATIVIDADE 7");
        Pessoa ps3 = new Pessoa("Júlio", 150);
        System.out.println(ps3.getIdade());

        System.out.println("---------------------------");

        System.out.println("ATIVIDADE 8");
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        System.out.println("Saldo atual: R$ " + conta.obterSaldo());
        sc.close();
        System.out.println("---------------------------");

        System.out.println("ATIVIDADE 9");
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.depositar(100);
        conta2.depositar(-50); // inválido

        conta2.sacar(30);
        conta2.sacar(500); // inválido

        System.out.println("Saldo final: R$ " + conta2.obterSaldo());
         System.out.println("---------------------------");

        System.out.println("ATIVIDADE 10");
       Cachorro c = new Cachorro();
    Gato g = new Gato();

        c.emitirSom();
        g.emitirSom();
    }
}
    

    





    
