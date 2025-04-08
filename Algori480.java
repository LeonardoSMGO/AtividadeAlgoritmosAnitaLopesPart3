import java.util.Scanner;

public class Algori480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, reverso;

        System.out.println("\nDigite numero: ");
        n = sc.nextInt();

        x = reverso(n);

        System.out.println("\n" + n + "-" + x);
        if (x == n) {
            System.out.println("\nE um numero capicua! ");
        } else {
            System.out.println("\nNao e um numero capicua! ");
        }
        System.out.println("\n");
    }
    public static int reverso(int num) {
        int soma, r;

        soma = 0;
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
}