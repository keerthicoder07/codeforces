import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        int changes = 0;

        for (int i = 0; i < n; i += 2) {
            if (arr[i] == arr[i + 1]) {

                changes++;
                arr[i + 1] = (arr[i] == 'a') ? 'b' : 'a';
            }
        }

        System.out.println(changes);
        System.out.println(new String(arr));
    }
}
