package String_Methods_Arrays;

import java.util.Scanner;
import String_Methods_Arrays.Task5;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Zəhmət olmasa mətni daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Word_Swap(a);
        System.out.println();
        Reverse(a);
    }

    public static void Word_Swap(String a) {
        String[] s = a.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]+" ");
        }
    }

    public static void Reverse(String a) {
        String[] s = a.split("");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}
