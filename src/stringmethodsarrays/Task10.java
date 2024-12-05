package stringmethodsarrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1,5,9,25,15,45,14,6,21,11}; // Daxil edilən massiv
        Array_Group(arr);
    }

    public static void Array_Group(int[] a) {
        int group0_10 = 0;
        int group11_20 = 0;
        int group21_30 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] <= 10) {
                group0_10++;
            } else if (a[i] >= 11 && a[i] <= 20) {
                group11_20++;
            } else if (a[i] >= 21 && a[i] <= 30) {
                group21_30++;
            }
        }
        System.out.println("[0-10]: " + group0_10 + " element");
        System.out.println("[11-20]: " + group11_20 + " element");
        System.out.println("[21-30]: " + group21_30 + " element");
    }
}
