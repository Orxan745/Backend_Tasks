package stringmethodsarrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,7,8,12,31,67,83,17,25,47,3};
        System.out.print("Yoxlamaq istədiyiniz ədədi daxil edin: ");
        int a = scanner.nextInt();
        int v = Check(arr, a);
        System.out.println(v);
    }

    public static int Check(int[] a, int b) {
        int c = -1;
        int d = -1;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                c = i;
                d = a[i];
            }
        }
        if (b == d) {
            return c;
        }
        return -1;
    }
}
