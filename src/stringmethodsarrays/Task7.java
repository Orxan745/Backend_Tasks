package stringmethodsarrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa mətni daxil edin: ");
        String mtn = scanner.nextLine();
        Reverse_String(mtn);
    }

    public static void Reverse_String(String a) {
        String result = "";
        String[] arr = new String[a.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.substring(i,i+1);
        }
        int b = 0;
        String[] x = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            x[b] = arr[i];
            b++;
        }
        for (int i = 0; i < x.length; i++) {
            result = result + x[i];
        }
        System.out.println("Daxil etdiyiniz mətnin tərsi: "+result);
    }
}
