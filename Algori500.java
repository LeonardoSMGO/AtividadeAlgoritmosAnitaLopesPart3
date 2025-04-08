import java.util.Scanner;

public class Algori500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        int[] num1 = new int[5];
        int L, flag, flag1, op;

        flag = 0;
        flag1 = 0;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
            num1[L] = 0;
        }
        do {
            System.out.println("\n\n\n");
            System.out.println("\nVETORES\n");
            System.out.println("\n 1 - Dados do VETOR A");
            System.out.println("\n 2 - Dados do VETOR B");
            System.out.println("\n 3 - Imprime VETORES");
            System.out.println("\n 4 - Soma VETORES");
            System.out.println("\n 5 - Subtrai VETORES");
            System.out.println("\n 6 - Sair do programa");
            System.out.print("\nOPCAO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    entrada(num1, 5, "B");
                    flag1 = 1;
                    break;
                case 3:
                    if (flag != 0 && flag1 != 0) {
                        imprime(num, 5, "A");
                        imprime(num1, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if (flag != 0 && flag1 != 0) {
                        soma(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if (flag != 0 && flag1 != 0) {
                        subtrai(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        } while (op != 6);

        System.out.println("\n");
        sc.close();
    }
    public static int[] entrada(int[] vet, int t, String c) {
        int L;
        System.out.println("\nEntrada do VETOR " + c + "\n");
        for (L = 0; L < t; L++) {
            System.out.print("Digite o " + (L + 1) + "º número: "+vet[L]);
        }
        return vet;
    }
    public static int[] imprime(int[] vet, int t, String c) {
        int L;
        System.out.println("\nVETOR " + c + "\n");
        for (L = 0; L < t; L++) {
            System.out.println((L + 1) + " - " + vet[L]);
        }
        return vet;
    }
    public static void soma(int[] vet, int[] vet1, int tam) {
        int L, s;
        System.out.println("\nSOMA\n");
        for (L = 0; L < tam; L++) {
            s = vet[L] + vet1[L];
            System.out.println("\n"+s);
        }
    }
    public static void subtrai(int[] vet, int[] vet1, int tam) {
        int L, d;
        System.out.println("\nDIFERENCA\n");
        for (L = 0; L < tam; L++) {
            d = vet[L] - vet1[L];
            System.out.println("\n"+d);
        }
    }
}