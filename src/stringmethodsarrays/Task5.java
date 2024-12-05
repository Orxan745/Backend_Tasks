package stringmethodsarrays;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Default Array: ");
        int[] arr = {1,15,124,85,67,98,32,9,29,44};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.print(" Result Array: ");
        Reverse_Array(arr);
    }

    public static void Reverse_Array(int[] a) {
        int b = 0;
        int[] x = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            x[b] = a[i];
            b++;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
