import java.io.InputStream;
import java.util.Scanner;

public class StringChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        char[] ar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 'a' || ar[i] == 'e' || ar[i] == 'i' || ar[i] == 'o' || ar[i] == 'u') {
                System.out.println(ar[i]);
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
