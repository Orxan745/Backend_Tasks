package stringmethodschar;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa söz və ya cümlə daxil edin: ");
        String soz = scanner.nextLine();  // Saitlərinin sayı tapılacaq söz
        String sait = "aıoueəiöüAIOUEƏİÖÜ";  // Saitlərin olduğu string
        int say = 0; // Satilərin sayını göstərən dəyişən
        char a;
        char b;
        for (int i = 0; i < soz.length(); i++){
            // soz stringinin hərflərini yoxlayan dövr

            for (int j = 0; j < 18; j++){
                // sait stringinin hərflərini yoxlayan dövr

                a = soz.charAt(i);  // Daxil edilən sözün i-ci elementi
                b = sait.charAt(j); // Saitlərin j-ci elementi
                // İkinci dövr bitmədən birinci dövrün lokal dəyişəni olan i dəyişəninin qiyməti
                // dəyişmədiyi üçün daxil edilən sözün ilk elementinin hər-hansı saitə bərabər
                // olub-olmadığını yoxlayır daha sonra i artanda 2-ci elementi yoxlayır və s.

                if (a==b){
                    say = say  + 1;
                }
            }
        }
        System.out.println("Saitlərin sayı: "+say);
    }
}
