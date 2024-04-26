import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("(1) soma");
        System.out.println("(2) subtração");
        System.out.println("(3) multiplicação");
        System.out.println("(4) divisão");
        System.out.println("Qual você quer? ");
        int escolha = ler.nextInt();
        int numero1;
        int numero2;
        if (escolha == 1) {
            System.out.println("Informe o numero: ");
            numero1 = ler.nextInt();
            System.out.println("Informe o numero2: ");
            numero2 = ler.nextInt();
            int soma = numero2 + numero1;
            System.out.println("" + numero1 + "+" + numero2 + "= " + soma);
        }

        if (escolha == 2) {
            System.out.println("Informe o numero: ");
            numero1 = ler.nextInt();
            System.out.println("Informe o numero2: ");
            numero2 = ler.nextInt();
            int subtração = numero2 - numero1;
            System.out.println("" + numero1 + "-" + numero2 + "= " + subtração);
        }

        if (escolha == 3) {
            System.out.println("Informe o numero: ");
            numero1 = ler.nextInt();
            System.out.println("Informe o numero2: ");
            numero2 = ler.nextInt();
            int multiplicação = numero2 * numero1;
            System.out.println("" + numero1 + "x" + numero2 + "= " + multiplicação);
        }

        if (escolha == 4) {
            System.out.println("Informe o numero: ");
            numero1 = ler.nextInt();
            System.out.println("Informe o numero2: ");
            numero2 = ler.nextInt();
            int divisão = numero2 / numero1;
            System.out.println("" + numero1 + "/" + numero2 + "= " + divisão);
        }

    }
}
