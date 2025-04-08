import java.util.Scanner;

public class Algori495 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L, c, tam, t1;
        String[] nome = new String[5];

        System.out.println("Digite os nomes:");
        for (L = 0; L < 5; L++) {
            System.out.print("Nome " + (L + 1) + ": ");
            nome[L] = sc.nextLine();
        }
        
        ordena(nome, 5);
        
        System.out.println("\nNOMES ORDENADOS\n");
        for (L = 0; L < 5; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }
        System.out.println("\n");
        sc.close();
    }
    public static void ordena(String[] vet, int tam) {
        int Li, ci;
        String aux;
        for (Li = 0; Li < tam - 1; Li++) {
            for (ci = Li + 1; ci < tam; ci++) {
                if (vet[Li].compareToIgnoreCase(vet[ci]) > 0) {
                    aux = vet[Li];
                    vet[Li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }
}