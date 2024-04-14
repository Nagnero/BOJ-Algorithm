import java.util.Scanner;

public class BOJ_5618_CommandDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++)
            m[i] = sc.nextInt();

        int gcd;
        if (n == 2) {
            gcd = GCD(m[0], m[1]);
        }
        else {
            int temp = GCD(m[0], m[1]);
            gcd = GCD(temp, m[2]);
        }

        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0)
                System.out.println(i);
        }
    }

    public static int GCD(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}