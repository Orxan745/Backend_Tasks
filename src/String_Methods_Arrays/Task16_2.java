package String_Methods_Arrays;

import java.util.Random;
import java.util.Scanner;
import String_Methods_Char.Task8;

public class Task16_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa yerdəyişmələrini tapmaq istədiyiniz mətni daxil edin: ");
        String str = scanner.next();
        All_Combinations(str);
    }

    public static void All_Combinations(String a) {
        Random random = new Random();
        String[] arr = a.split("");
        int count = Task8.Faktorial(arr.length);
        String[] result = new String[count];
        String pre_result;
        int a1;
        int a2;
        int t = 0;
        while (result[t] == null) {
            pre_result = "";
            a1 = random.nextInt(0, arr.length);
            a2 = random.nextInt(0, arr.length);
            String y = arr[a1];
            arr[a1] = arr[a2];
            arr[a2] = y;
            for (int j = 0; j < arr.length; j++) {
                pre_result = pre_result + arr[j];
            }
            int v = Task4_2.Check(result, pre_result);
            if (v == -1) {
                result[t] = pre_result;
                t++;
            }
            if (t == result.length) {
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }
    }
}