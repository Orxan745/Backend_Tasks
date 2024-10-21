package String_Methods_Char;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa mətni daxil edin: ");
        String s = scanner.nextLine();
        camelCase(s);
    }

    public static void camelCase(String a) {
        String s;
        boolean x;
        String b;
        for (int i = 0; i < a.length(); i++){
            s = a.substring(i,i+1);
            x = s.equals(" ");
            if (x){
                i++;
                s = a.substring(i,i+1);
                b = s.toUpperCase();
            }else {
                b = s.toLowerCase();
            }
            a = a.replace(s,b);
        }
        a = a.replaceAll(" ","");
        System.out.println("camelCase: "+a);
    }
}
