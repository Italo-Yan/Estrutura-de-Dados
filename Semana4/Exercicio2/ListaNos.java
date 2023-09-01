package Semana4.Exercicio2;

class ListaNos { // Classe que representa uma lista de nós
    private No inicio;

    public boolean estaVazia() { // Método que verifica se a lista está vazia.
        return inicio == null; // Retorna true se o início for uma lista vazia.
    }

    public void inserirNoInicio(int valor) { // Método para inserir um novo nó no início da lista. 
        No novoNo = new No(valor); // Cria um novo nó com o valor fornecido.
        novoNo.proximo = inicio; // O próximo do novo nó aponta para o nó que era o início anteriormente.
        inicio = novoNo; // O novo nó se torna o início da lista.
    }

    public void inserirNoFim(int valor) { // Método para inserir um novo nó no final da lista.
        No novoNo = new No(valor); // Cria um novo nó com o valor fornecido.
        if (inicio == null) { // Se a lista estiver vazia, o novo nó se torna o início.
            inicio = novoNo;
            return;
        }
        No atual = inicio; // Caso ao contrário, pecorre a lista até encontar o último nó.
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo; // O próximo do último nó aponta para o novo nó.
    }

    public void removerNoInicio() { // Método para remover o nó do inicio da lista
        if (inicio != null) { // Se a lista não estiver vazia, move o início para o próximo nó
            inicio = inicio.proximo;
        }
    }

    public void imprimir() { // Método para imprimir todos os valores da lista.
        No atual = inicio;
        while (atual != null) {  // Enquanto houver nós na lista, imprime o valor e move para o próximo nó.
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println(); // Imprime uma nova linha no final.
    }
}
