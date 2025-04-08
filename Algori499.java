import java.util.Scanner;

public class Algori499 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int L, flag, op;
        flag = 0;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println(" MENU VETOR - FUNÇÃO ");
            System.out.println("1 - Dados do VETOR");
            System.out.println("2 - Ordenar VETOR");
            System.out.println("3 - Imprimir VETOR");
            System.out.println("4 - Sair do programa");
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    num = entrada(num, 5, sc);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        num = ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro a opção 1");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        num = imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro a opção 1");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        } while (op != 4);
        System.out.println("\n");
        sc.close();
    }
    public static int[] entrada(int[] vet, int t, Scanner sc) {
        int L;
        System.out.println("\nEntrada do VETOR");
        for (L = 0; L < t; L++) {
            System.out.print("Digite o " + (L + 1) + "º número: ");
            vet[L] = sc.nextInt();
        }
        return vet;
    }
    public static int[] imprime(int[] vet, int t) {
        int L;
        System.out.println("\nVETOR");
        for (L = 0; L < t; L++) {
            System.out.println((L + 1) + " - " + vet[L]);
        }
        return vet;
    }
    public static int[] ordena(int[] vet, int tam) {
        int L1, C1, aux;
        for (L1 = 0; L1 < tam - 1; L1++) {
            for (C1 = L1 + 1; C1 < tam; C1++) {
                if (vet[L1] > vet[C1]) {
                    aux = vet[L1]; vet[L1] = vet[C1]; vet[C1] = aux;
                }
            }
        }
        return vet;
    }
}