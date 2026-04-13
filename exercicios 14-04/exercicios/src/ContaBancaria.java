class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

class ContaInativaException extends Exception {
    public ContaInativaException(String msg) {
        super(msg);
    }
}

class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String msg) {
        super(msg);
    }
}

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(int numero, String titular, double saldo, boolean ativa) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public void sacar(double valor)
            throws SaldoInsuficienteException, ContaInativaException {

        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido");
        }

        if (!ativa) {
            throw new ContaInativaException("Conta inativa");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        saldo -= valor;
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido");
        }

        saldo += valor;
        System.out.println("Saldo: " + saldo);
    }
}