import java.util.Scanner;

public class BOJ_1978_PrimeNum {
    public static void main(String[] args) {
        int n, cnt = 0, input;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            input = sc.nextInt();
            if (input == 1) continue;
            boolean prime = true;

            for (int j = 2; j < input; j++) {
                if (input % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) cnt++;
        }

        System.out.println(cnt);
    }
}