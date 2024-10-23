package String_Methods_Arrays;

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
        int x = array[0]; // Elementlərin ən böyüyünü mənimsədəcəyimiz dəyişən
        int y = array[0]; // Elementlərin ən kiçiyini mənimsədəcəyimiz dəyişən
        for (int i = 0; i < a; i++) {
            if (x < array[i]) {
                x = array[i];
            }
        }
        for (int i = 0; i < a; i++) {
            if (y > array[i]) {
                y = array[i];
            }
        }
        System.out.println("Daxil edilən massivin ən böyük elementi: "+x);
        System.out.println("Daxil edilən massivin ən kiçik elementi: "+y);
    }
}