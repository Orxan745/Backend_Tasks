package stringmethodsarrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa mətni daxil edin: ");
        String mtn = scanner.nextLine();
        int a = CountOfWords(mtn);
        System.out.println("Daxil edilən mətndəki sözlərin sayı: "+a);
    }

    public static int CountOfWords(String a) {
        int say = 0;
        for (int i = 0; i < a.length(); i++) {
            String b = a.substring(i,i+1);
            if (b.equals(" ")) {
                say = say + 1;
            }
        }
        return say+1;
    }
}
