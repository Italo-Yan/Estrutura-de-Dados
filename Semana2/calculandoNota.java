import java.util.Scanner;

public class calculandoNota {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.print("Nota da primeira prova: ");
        double notaProva1 = nota.nextDouble();

        System.out.print("Nota da segunda prova: ");
        double notaProva2 = nota.nextDouble();

        System.out.print("Nota do trabalho: ");
        double notaTrabalho = nota.nextDouble();

        double media = (notaProva1 + notaProva2 +notaTrabalho) / 3;

        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        nota.close();
    }
}

