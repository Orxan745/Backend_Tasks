package String_Methods_Arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin neçə elementdən ibarət olacağını daxil edin: ");
        int a = scanner.nextInt(); // Massivin elementləri sayı
        System.out.print("Massivin elementlərini daxil edin: ");
        int[] array = new int[a];
        for (int i = 0; i < a ; i++) {
            array [i] = scanner.nextInt();
        }
        System.out.print("Daxil etdiyiniz massiv: ");
        for (int i = 0; i < a; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        Swap_Min_Max(array);

        System.out.print("Nəticə: ");
        for (int i = 0; i < a; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void Swap_Min_Max(int[] a){
        int x = a[0]; // Elementlərin ən böyüyünü mənimsədəcəyimiz dəyişən
        int y = a[0]; // Elementlərin ən kiçiyini mənimsədəcəyimiz dəyişən
        int z = 0;
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            if (x < a[i]) {
                x = a[i];
                z = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (y > a[i]) {
                y = a[i];
                r = i;
            }
        }
        a[z] = y;
        a[r] = x;
    }
}
