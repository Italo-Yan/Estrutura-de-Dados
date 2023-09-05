package Semana5.Desafio1;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    double altura, peso;

    public Pessoa(String nome, int idade, String sexo, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String toString() {
        return nome + ", " + idade + " anos, " + sexo + ", " + altura + "m, " + peso + "kg";
    }
}
