package Semana3;

public class Principal {

    public static void main(String[] args) {
        int[] numeros = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        int soma = 0;
        for (int number : numeros) {
            soma += number;
        }

        System.out.println("A soma dos elementos é: " + soma);
    }
}
