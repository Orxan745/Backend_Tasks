package hackerrank;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        String st2 = scanner.nextLine();
        String st3 = scanner.nextLine();
        String[] arr1 = st1.split(" ");
        String[] arr2 = st2.split(" ");
        String[] arr3 = st3.split(" ");
        while (arr1[1].length() < 3) {
            arr1[1] = "0" + arr1[1];
        }
        while (arr2[1].length() < 3) {
            arr2[1] = "0" + arr2[1];
        }
        while (arr3[1].length() < 3) {
            arr3[1] = "0" + arr3[1];
        }
        System.out.println("================================");
        System.out.print(arr1[0]);
        printSpace(arr1[0]);
        System.out.println(arr1[1]);
        System.out.print(arr2[0]);
        printSpace(arr2[0]);
        System.out.println(arr2[1]);
        System.out.print(arr3[0]);
        printSpace(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println("================================");
    }

    public static void printSpace(String st) {
        for (int i = 0; i < 15-st.length(); i++) {
            System.out.print(" ");
        }
    }
}
