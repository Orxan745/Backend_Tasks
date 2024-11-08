package String_Methods_Arrays;

import java.util.Objects;
import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] arr = {"ab","ca","abc","acb"};
    System.out.print("Yoxlamaq istədiyiniz mətni daxil edin: ");
    String a = scanner.next();
    int v = Check(arr, a);
    System.out.println(v);
}

    public static int Check(String[] a, String b) {
        int c = -1;
        String d = "";
        for (int i = 0; i < a.length; i++) {
            if (Objects.equals(b, a[i])) {
                c = i;
                d = a[i];
            }
        }
        if (Objects.equals(b, d)) {
            return c;
        }
        return -1;
    }
}
