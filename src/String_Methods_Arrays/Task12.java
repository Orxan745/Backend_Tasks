package String_Methods_Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] a = {2,6,8,9,5,1};
        int[] b = {5,7,11,1,2,3};

        int[] result = Common_Elements(a,b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] Common_Elements(int[] a,int[] b) {
        int count = 0;
        int[] x = new int[a.length];
        int f = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    x[f] = a[i];
                    count++;
                    f++;
                }
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = x[i];
        }

        return result;
    }
}