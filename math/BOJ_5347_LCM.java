import java.util.Scanner;

public class BOJ_5347_LCM {
    public static void main(String[] args) {
       int n, a, b, temp;
       Scanner sc = new Scanner(System.in);

       n = sc.nextInt();

       for (int i = 0; i < n; i++) {
           a = sc.nextInt();
           b = sc.nextInt();
           if (a < b) {
               temp = a;
               a = b;
               b = temp;
           }
           long lcd = (long)a * b / gcd(a, b);
           System.out.println(lcd);
       }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}