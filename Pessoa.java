public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        setIdade(idade); 
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade >= 0 && idade <= 100){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}