package Semana3.Pratica3;

public class Principal {
    public static void main(String[] args) {
        // Criando um array de Agenda com 5 posições
        Agenda[] contatos = new Agenda[5];

        // Inicializando o array com dados
        contatos[0] = new Agenda("Luana", "1234-5678", 25);
        contatos[1] = new Agenda("Felipe", "2345-6789", 30);
        contatos[2] = new Agenda("Larissa", "3456-7890", 28);
        contatos[3] = new Agenda("Gabriel", "4567-8901", 22);
        contatos[4] = new Agenda("Alexandre", "5678-9012", 31);

        // Imprimindo os contatos
        for (Agenda contato : contatos) {
            System.out.println(contato);
        }
    }
}