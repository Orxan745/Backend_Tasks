package hackerrank;

import java.util.Scanner;

public class Task10 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        String[] substrings = new String[s.length()-(k-1)];
        for (int i = 0; i <= s.length()-k; i++) {
            substrings[i] = s.substring(i, k+i);
        }
        for (int i = 0; i < substrings.length-1; i++) {
            if (substrings[i].compareTo(substrings[i+1]) < 0) {
                String str = substrings[i];
                substrings[i] = substrings[i+1];
                substrings[i+1] = str;
            }
        }
        largest = substrings[0];
        smallest = substrings[substrings.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
