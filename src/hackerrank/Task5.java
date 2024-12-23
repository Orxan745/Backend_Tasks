package hackerrank;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(a+" x "+(i+1)+" = "+(a*(i+1)));
        }
    }
}
