package String_Methods_Char;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa hərf və rəqəm qarışıq cümlə daxil edin: ");
        String a = scanner.nextLine();  // İstifadəçinin daxil edəcəyi cümlə
        String reqem = "0123456789";
        int cem = 0; // Cümlədə daxil edilən rəqəmlərin cəmi
        char x;  // Cümlənin ilk elementi
        char y;  // reqem Stringinin ilk elementi
        for (int i = 0; i < a.length(); i++){
            // Daxil edilən cümlənin elementlərini yoxlayan dövr

            for (int j = 0; j < 10; j++){
                // reqem Stringinin elementlərini yoxlayan dövr

                x = a.charAt(i);
                y = reqem.charAt(j);
                if (x==y){
                    int z = (int) y - 48;
                    cem = cem + z;
                }
            }
        }
        System.out.println(cem);
    }
}
