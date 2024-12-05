package stringmethodschar;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa sözü daxil edin: ");
        String soz = scanner.nextLine();
        UpperCaseFirstSymbol(soz);
    }

    public static void UpperCaseFirstSymbol(String a){
        String herf = a.substring(0,1);
        String Herf = herf.toUpperCase();
        a = a.replaceFirst(herf,Herf);
        System.out.println(a);
    }
}
