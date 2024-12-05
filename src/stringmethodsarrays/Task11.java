package stringmethodsarrays;

public class Task11 {
    public static void main(String[] args) {
        int[] a = {1,9,8,15,34,25,99,74,12}; // Daxil edilən massiv

        Artan_Sira(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void Artan_Sira(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }
}
