package stringmethodsarrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin neçə elementdən ibarət olacağını daxil edin: ");
        int a = scanner.nextInt(); // Massivin elementləri sayı
        System.out.print("Massivin elementlərini daxil edin: ");
        int[] array = new int[a];
        int x = 1;
        for (int i = 0; i < a ; i++) {
            array [i] = scanner.nextInt();
        }

        SumOfOdd(array);
        ProductOfEven(array);
    }

    public static void SumOfOdd(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                sum = sum + a[i];
            }
        }
        System.out.println("Daxil edilən massivin tək elementlərinin cəmi: "+sum);
    }

    public static void ProductOfEven(int[] a) {
        int x = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                x = x * a[i];
            }
        }
        System.out.println("Daxil edilən massivin cüt elementlərinin hasili: "+x);
    }
}
