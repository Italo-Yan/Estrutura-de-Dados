package Semana5.Exercicio1;

public class Fila {
    String nome;
    No cabeca, calda;
    Fila(String nome) { this.nome = nome; }
    boolean isNull() { return cabeca == null; }
    void enqueue(int dado) {
        No novoNo = new No(dado);
        if (isNull()) cabeca = calda = novoNo;
        else calda = calda.proximo = novoNo;
    }
    Integer dequeue() {
        if (isNull()) return null;
        int dado = cabeca.dado;
        cabeca = cabeca.proximo;
        return dado;
    }
    Integer head() { return isNull() ? null : cabeca.dado; }
    void print() {
        for (No atual = cabeca; atual != null; atual = atual.proximo) System.out.print(atual.dado + " ");
        System.out.println();
    }
}
