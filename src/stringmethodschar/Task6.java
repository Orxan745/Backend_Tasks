package stringmethodschar;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa şifrələmək istədiyiniz mətni daxil edin: ");
        String s = scanner.nextLine(); // İstifadəçinin daxil edəcəyi mətn
        System.out.print("Zəhmət olmasa şifrənin indeksini daxil edin: ");
        int index = scanner.nextInt(); // Mətnin hərflərinin əlifbada nə qədər sürüşəcəyini təyin edən dəyişən
        char a; // Mətnin elementlərini mənimsədib dəyişəcəyimiz dəyişən
        int x; // Char dəyişəninin ASCII-dəki dəyəri
        String result = ""; // Şifrələmənin nəticəsi
        for (int i = 0; i < s.length(); i++){
            a = s.charAt(i);
            x = (int) a;
            if (x>= 65 && x<=90 || x>=97 && x<=122){
                if (x-index>=65 && x-index<=90 || x-index>=97){
                    x = x - index;
                } else {
                    x = x - index + 26;
                }
            }
            a = (char) x;
            result = result + a;
        }
        System.out.println(result);
    }
}
