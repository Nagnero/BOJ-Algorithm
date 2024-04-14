import java.util.Scanner;

public class BOJ_2581_prime2 {
    public static boolean not_prime[];

    public static void get_not_prime() {
        not_prime[0] = true;
        not_prime[1] = true;

        for (int i = 2; i < Math.sqrt(not_prime.length); i++) {
            for (int j = i * i; j < not_prime.length; j += i)
                not_prime[j] = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        not_prime = new boolean[n + 1];
        get_not_prime();


        int sum = 0;
        int min = Integer.MIN_VALUE;

        for (; m <= n; m++) {
            if (!not_prime[m]) {
                sum += m;
                if (min == Integer.MIN_VALUE)
                    min = m;
            }
        }
        if (sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
