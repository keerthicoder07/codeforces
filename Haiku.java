import java.util.*;

public class Haiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));

        int count1 = 0, count2 = 0, count3 = 0;
        int i = 0, j = 0, k = 0;
        int l1 = str1.length(), l2 = str2.length(), l3 = str3.length();

        while (i < l1 || j < l2 || k < l3) {
            if (i < l1 && vowels.contains(str1.charAt(i))) count1++;
            if (j < l2 && vowels.contains(str2.charAt(j))) count2++;
            if (k < l3 && vowels.contains(str3.charAt(k))) count3++;
            i++; j++; k++;
        }

        if (count1 == 5 && count2 == 7 && count3 == 5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
