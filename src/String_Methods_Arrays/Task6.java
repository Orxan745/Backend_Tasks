package String_Methods_Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {5,9,14,55,14,87,9,9,8,7,45,12};
        System.out.print("Default Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------");
        Remove_Duplicate(arr);
    }

    public static void Remove_Duplicate(int[] a){
        int say = 0;
        int[] x = new int[a.length];
        boolean b;
        for (int i = 0; i < a.length; i++) {
            b = false;
            for (int j = 0; j < say ; j++) {
                if (a[i] == x[j]) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                x[say] = a[i];
                say++;
            }
        }
        int[] result = new int[say];
        for (int i = 0; i < say; i++){
            result[i] = x[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
