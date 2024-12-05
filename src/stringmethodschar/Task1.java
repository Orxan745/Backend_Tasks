package stringmethodschar;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Zəhmət olmasa parolun uzunluğunu daxil edin: ");
        int a = scanner.nextInt();        // a --> parolun uzunluğu
        int b;        // Random seçilib char-a castlanacaq dəyişən
        char c;      // Parolun elementləri olacaq dəyişən
        String result = "";    // parol
        for (int i = 0; i < a; i++){
            //Istifadəçi tərəfindən təyin edilən a qədər random ədəd almaq üçün dövr
            b = random.nextInt(48,122);
            c = (char) b;
            result = result + c;
        }
        System.out.println(result);
    }
}
