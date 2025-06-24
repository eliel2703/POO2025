package Entities.TesteIterator;

public class Pessoa {

    private String nome;
    private int idade;
    private int dinheiro;

    public Pessoa(String nome, int idade, int dinheiro) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Dinheiro: " + this.dinheiro);
    }
}