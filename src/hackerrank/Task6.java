package hackerrank;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [][] arr = new int[x][3];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            createQuery(arr, i);
            System.out.println();
        }
    }

    public static void createQuery(int[][] arr, int y) {
        int a = arr[y][0];
        int b = arr[y][1];
        int c = arr[y][2];
        int d = 1;
        int e = a + d * b;
        for (int j = 2; j <= c + 1; j++) {
            d = d * 2;
            System.out.print(e + " ");
            e = e + d * b;
        }
    }
}