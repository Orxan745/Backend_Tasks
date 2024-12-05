package stringmethodsarrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin neçə elementdən ibarət olacağını daxil edin: ");
        int a = scanner.nextInt(); // Massivin elementləri sayı
        System.out.print("Massivin elementlərini daxil edin: ");
        int[] array = new int[a];
        for (int i = 0; i < a ; i++) {
            array [i] = scanner.nextInt();
        }
        Maximum(array);
        Minimum(array);
    }

    public static void Minimum(int[] a) {
        int x = a[0]; // Elementlərin ən böyüyünü mənimsədəcəyimiz dəyişən
        for (int i = 0; i < a.length; i++) {
            if (x < a[i]) {
                x = a[i];
            }
        }
        System.out.println("Daxil edilən massivin ən böyük elementi: "+x);
    }

    public static void Maximum(int[] a) {
        int y = a[0]; // Elementlərin ən kiçiyini mənimsədəcəyimiz dəyişən
        for (int i = 0; i < a.length; i++) {
            if (y > a[i]) {
                y = a[i];
            }
        }
        System.out.println("Daxil edilən massivin ən kiçik elementi: "+y);
    }
}