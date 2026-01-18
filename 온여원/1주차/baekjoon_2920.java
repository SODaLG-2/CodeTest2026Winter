import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main (String[] args) throws IOException {
        int[] arr = new int [8];
        int[] a = new int [8];
        int[] b = new int [8];

        for (int i = 0; i < 8; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < 8; i++) {
            b[i] = 8 - i;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        if (Arrays.equals(arr, a)) {
            System.out.println("ascending");
        }
        else if (Arrays.equals(arr, b)) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}
