import java.util.Scanner;

public class Algori470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, pri;
        int primo;
        
        System.out.println("\nDigite um número > 0: ");
        num = sc.nextInt();

        pri = primo(num);
        
        if (pri == 0) {
            System.out.println("\nÉ primo: " + num);
        } else {
            System.out.println("\nNão é primo: " + num);
        }
        System.out.println("\n");
        sc.close();
    }
    public static int primo(int n) {
        int c, p;
        p = 2;
        c = 0;
        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }
        return c;
    }
}