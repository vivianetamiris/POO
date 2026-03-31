public class ContaBancaria{

private double saldo;

public void depositar (double valor){
    if (valor > 0){
        saldo +=valor;
    } else {
    System.out.println("Valor não permitido!");    
    }
    
}

public void sacar (double valor){
    if (valor <= saldo){
    saldo -=valor;
} else{
    System.out.println("Saldo insuficiente");
        }
}

public double obterSaldo (){
    return saldo;
}


}