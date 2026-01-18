import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        int a;
        String b;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.nextLine()); // Integer는 int를 객체로 다루기 위해 만든 클래스, parseInt는 정수로 해석하다의 의미
        b = scanner.nextLine(); // 문자열 전체

        for(int i = 0; i < a; i++) {
            int s;
            s = b.charAt(i) - 48; // b.charAt(i)는 i번재 위치의 문자를 하나 가져온다는 의미
            sum += s;
        }
        System.out.println(sum);
    }
}
