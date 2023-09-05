package Semana5.Desafio1;

public class Fila {
    No cabeca, calda;

    public boolean isNull() { return cabeca == null; }

    public void enqueue(Pessoa pessoa) {
        No novoNo = new No(pessoa);
        if (isNull()) cabeca = calda = novoNo;
        else calda = calda.proximo = novoNo;
    }

    public Pessoa dequeue() {
        if (isNull()) return null;
        Pessoa pessoa = cabeca.pessoa;
        cabeca = cabeca.proximo;
        return pessoa;
    }

    public Pessoa head() { return isNull() ? null : cabeca.pessoa; }

    public void print() {
        for (No atual = cabeca; atual != null; atual = atual.proximo) System.out.println(atual.pessoa);
    }
}
