package hackerrank;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int lengthSum = a.length() + b.length();
        System.out.println(lengthSum);
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String capitalizedStr1 = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedStr2 = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(capitalizedStr1 + " " + capitalizedStr2);
    }
}
