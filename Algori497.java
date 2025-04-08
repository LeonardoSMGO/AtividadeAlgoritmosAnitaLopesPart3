import java.util.Scanner;

public class Algori497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L, c, n, busca, ordena;
        int[] num = new int[10];

        for (L = 0; L < 10; L++) {
            System.out.print("Digite numero " + (L + 1) + ": ");
            num[L] = sc.nextInt();
        }
        
        System.out.print("Digite numero de busca: ");
        n = sc.nextInt();

        ordena(num, 10);

        c = busca(num, 10, n);
        
        System.out.println("\nVETOR\n");
        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }
        
        if (c != -1) {
            System.out.println("\n\nPosicao no vetor: " + (c + 1));
        } else {
            System.out.println("\n\nNão ENCONTRADO");
        }
        System.out.println("\n");
        sc.close();
    }
    public static int busca(int vet[], int tam, int chave) {
        int ini = 0, fim = tam - 1, meio = -1;
        
        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        return meio;
    }
    public static void ordena(int vet[], int tam) {
        int aux;
        for (int L1 = 0; L1 < tam; L1++) {
            for (int c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1] > vet[c1]) {
                    aux = vet[L1]; vet[L1] = vet[c1]; vet[c1] = aux;
                }
            }
        }
    }
}