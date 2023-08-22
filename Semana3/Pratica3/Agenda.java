package Semana3.Pratica3;

public class Agenda {
    public String nome;
    public String telefone;
    public int idade;

    public Agenda(String nome, String telefone, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Idade: " + idade;
    }
}