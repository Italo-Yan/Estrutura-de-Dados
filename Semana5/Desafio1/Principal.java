package Semana5.Desafio1;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enqueue(new Pessoa("Luana", 19, "Feminino", 1.65, 60));
        fila.enqueue(new Pessoa("Italo", 20, "Masculino", 1.90, 90));

        System.out.println("Estado inicial da fila:");
        fila.print();

        System.out.println("Cabeça da fila: " + fila.head());

        System.out.println("Removendo pessoa da fila: " + fila.dequeue());

        System.out.println("Estado da fila após remoção:");
        fila.print();
    }
}

