package hackerrank;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++) {
                long x = scanner.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                else if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                else if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                System.out.println("* long");
        }
    }
}