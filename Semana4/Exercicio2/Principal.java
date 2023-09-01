package Semana4.Exercicio2;

public class Principal {
    public static void main(String[] args) { // Método principal que é executado quando o programa é iniciado.
        ListaNos lista = new ListaNos(); // Cria ma lista de nós.

        lista.inserirNoInicio(3); // Insere o número 3 no início da lista.
        lista.inserirNoFim(7); // Insere o número 7 no final da lista.
        lista.inserirNoInicio(1); // Insere o número 1 no início da lista.

        System.out.println("Lista antes de remover:"); // Imprime a mensafem e em seguida a lista atual.
        lista.imprimir();

        lista.removerNoInicio(); // Remove o primeiro nó da lista.

        System.out.println("Lista depois de remover:"); // Imprime a mensagem e em seguida a lista após a remoção.
        lista.imprimir();
    }
}
