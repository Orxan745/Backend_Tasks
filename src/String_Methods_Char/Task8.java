package String_Methods_Char;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa faktorialını hesablamaq istədiyiniz ədədi daxil edin: ");
        int a = scanner.nextInt(); // Faktorialı hesablanacaq ədəd
        int b = Faktorial(a);
        System.out.println("Daxil etdiyiniz ədədin faktorialı: "+b);
    }

    public static int Faktorial(int a) {
        if (a == 1){
            return 1;
        }
        return a * Faktorial(a-1);
    }
}
