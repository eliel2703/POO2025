package Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Conta {
    
    private String nome;
    private int senha;
    private Status status;
    private long idade;

    public Conta(String nome, int senha, String dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNasc = LocalDate.parse(dataNascimento);

        this.nome = nome;
        this.senha = senha;
        this.status = null;

        this.idade = ChronoUnit.YEARS.between(dataNasc, dataAtual);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public long getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
