package String_Methods_Arrays;

import java.util.Scanner;
import String_Methods_Char.Task8;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa yerdəyişmələrini görmək istədiyiniz mətni daxil edin: ");
        String mtn = scanner.nextLine();
        All_Combination(mtn);
    }

    public static void All_Combination(String a) {
        int count = Task8.Faktorial(a.length());
        int parametr1 = count / a.length();
        String[] str = a.split("");
        String[] result = new String[count];
        String pre_result = "";
        for (int i = 0; i < a.length()-1; i++) {
            for (int j = 1; j < parametr1-1; j++) {
                if (!pre_result.isEmpty()){
                    pre_result = pre_result + str[j];
                    System.out.println(pre_result);
                    if (pre_result.length() == a.length()) {
                        int x = 0;
                        for (int k = 0; k < count; k++) {
                            result[x] = pre_result;
                            x++;
                        }
                    }
                }else {
                    pre_result = str[i] + str[j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
