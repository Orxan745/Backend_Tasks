package stringmethodsarrays;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa mətn daxil edin: ");
        String mtn = scanner.nextLine();
        FirstLetterUpperCase(mtn);
    }

    public static void FirstLetterUpperCase(String a) {
        String[] str = a.split(" ");
        for (int i = 0; i < str.length; i++) {
            String x = str[i].substring(0, 1);
            String y = x.toUpperCase();
            str[i] = str[i].replaceFirst(x, y);
        }
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result = result + str[i] + " ";
        }
        System.out.println(result);
    }
}