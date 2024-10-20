package String_Methods_Char;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa söz və ya cümlə daxil edin: ");
        String soz = scanner.nextLine();  // Saitlərinin sayı tapılacaq söz
        String sait = "aıoueəiöüAIOUEƏİÖÜ";  // Saitlərin olduğu string
        String a; // Saitləri əvəz edəcək dəyişən
        String b = "";
        for (int i = 0; i < 18; i++){
            a = sait.substring(i,i+1);
            soz = soz.replaceAll(a,b);
        }
        System.out.println(soz);
    }
}