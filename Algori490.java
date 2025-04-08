import java.util.Scanner;

public class Algori490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[10];
        int L;

        for (L = 0; L < 10; L++) {
            System.out.println("Digite palavra em letras minusculas " + (L + 1) + ":");
            nome[L] = sc.nextLine();
        }
        for (L = 0; L < 10; L++) {
            System.out.println("\n" + (L + 1) + " - " + nome[L]);
        }
    }
    public static int restantes(String[] vet, int tam, String x) {
        
        int i, cont = 0;
        
        for (i = 0; i < tam; i++) {
            if (vet[i].equals(x)) {
                vet[i] = "*";
                cont++;
            }
        }
        return cont;
    }
}