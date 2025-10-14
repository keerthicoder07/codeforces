import java.util.*;

public class GiftInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            // p[i] is the receiver for giver (i+1)
            // So, the giver (i+1) gave a gift to p[i]
            // Therefore, the receiver p[i] got a gift from (i+1)
            inv[p[i] - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(inv[i] + " ");
        }
    }
}
