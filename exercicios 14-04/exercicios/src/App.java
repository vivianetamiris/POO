public class App {
    public static void main(String[] args) {
        System.out.println("======Sistema Bancário======");

        ContaBancaria conta = new ContaBancaria(1, "Viviane", 1000, true);
        ContaBancaria contaInativa = new ContaBancaria(2, "Ana", 500, false);

        try {
            conta.depositar(-10);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            contaInativa.sacar(100);
        } catch (ContaInativaException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(2000);
        } catch (ContaInativaException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(200);
        } catch (ContaInativaException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------");

        System.out.println("=====Agenda de voos=====");
         Voo voo = new Voo(101, 5, 200);

        try {
            voo.reservarAssento(2, 400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            voo.reservarAssento(2, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            voo.reservarAssento(10, 2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            voo.cancelarVoo();
        } catch (VooCanceladoException e) {
            System.out.println(e.getMessage());
        }

    }
}