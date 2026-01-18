import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for(int i = 1; i <= a; i++) {
            for(int j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}