import java.util.Scanner;

public class BOJ_2960_Eratosthenes {
    public static void main(String[] args) {
        int N, K, p;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            arr[i] = 0;
        }

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 1) continue; // 이미 지운 수 pass

            for (int j = i; j <= N; j += i) {
                if (arr[j] == 0) {
                    arr[j] = 1;
                    K--;
                }
                if (K == 0) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}