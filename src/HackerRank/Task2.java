package HackerRank;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1) {   // tek
            System.out.println("Weird");
        } else if (n % 2 == 0) {   // cut
            if (n <= 20 && n >= 6) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        }
    }
}
