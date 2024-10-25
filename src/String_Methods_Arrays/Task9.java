package String_Methods_Arrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa mötərizələri daxil edin: ");
        String b = scanner.next();
        int x = b.indexOf("}") - b.indexOf("{");
        int y = b.indexOf("]") - b.indexOf("[");
        int z = b.indexOf(")") - b.indexOf("(");
        if (x == 1 || x == 3 || x == 5) {
            if (y == 1 || y == 3 || y == 5) {
                if (z == 1 || z == 3 || z == 5) {
                    System.out.println("Balanslıdır.");
                }
            }
        }else {
            System.out.println("Balanslı deyil.");
        }
    }
}
