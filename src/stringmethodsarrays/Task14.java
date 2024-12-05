package stringmethodsarrays;

import java.util.Objects;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa sözləri daxil edin: ");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = Anagram(a,b);
        System.out.println(c);
    }

    public static String Anagram(String a, String b){
        if (a.length() != b.length()){
            System.out.println("Bu sözlər anagram deyil.");
            return "";
        }else {
            int count = 0;
            int c = 1;
            String[] str1 = a.split("");
            String[] str2 = b.split("");
            for (int i = 0; i < str1.length; i++) {
                for (int j = 0; j < str2.length; j++) {
                    if (Objects.equals(str1[i], str2[j])) {
                        count++;
                    }
                }
                if (count < c) {
                    return "Bu sözlər anagram deyil.";
                }else {
                    c++;
                }
            }
            return "Bu sözlər anagramdır.";
        }
    }
}