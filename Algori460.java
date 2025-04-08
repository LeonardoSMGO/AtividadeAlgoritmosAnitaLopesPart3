import java.util.Scanner;

public class Algori460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, c;
        int dob;

        for (c = 1; c <= 3; c++) {
            System.out.println("\n\nDigite numero: ");
            a = sc.nextInt();

            System.out.println("dobro : " + dob(a));
        }
        System.out.println("\n");
        sc.close();
    }
    public static int dob(int num) {
        return num * 2;
    }
}