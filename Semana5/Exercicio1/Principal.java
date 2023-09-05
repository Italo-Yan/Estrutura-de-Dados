package Semana5.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila("Minha Fila");
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println("Estado inicial da fila:");
        fila.print();

        System.out.println("Cabeça da fila: " + fila.head());

        System.out.println("Removendo elemento da fila: " + fila.dequeue());

        System.out.println("Estado da fila após remoção:");
        fila.print();
    }
}