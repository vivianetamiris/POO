public class Voo {
    private int numeroVoo;
    private int assentosDisponiveis;
    private double valorPassagem;

    public Voo(int numeroVoo, int assentosDisponiveis, double valorPassagem) {
        this.numeroVoo = numeroVoo;
        this.assentosDisponiveis = assentosDisponiveis;
        this.valorPassagem = valorPassagem;
    }

    public void reservarAssento(int quantidade, double valorPago)
            throws VooLotadoException {

        if (quantidade <= 0) {
            throw new ValorInvalidoException("Quantidade inválida");
        }

        if (quantidade > assentosDisponiveis) {
            throw new VooLotadoException("Voo lotado");
        }

        if (valorPago < (quantidade * valorPassagem)) {
            throw new ValorInvalidoException("Valor insuficiente");
        }

        assentosDisponiveis -= quantidade;
        System.out.println("Reserva realizada");
    }

    public void cancelarVoo() throws VooCanceladoException {
        throw new VooCanceladoException("Voo cancelado");
    }
}