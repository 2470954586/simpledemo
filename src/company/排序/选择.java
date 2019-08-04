package company.排序;


public class 选择 {
    public static void main(String args[]) {
        int[] aa = {1, 23, 34, 465, 56, 78, 784};
        seletSort(aa);
        for (int s : aa) {
            System.out.println(s);
        }
    }

    public static void seletSort(int[] a) {
        int length = a.length;
        int temp = 0;
        for (int j = 0; j < length - 1; j++) {
            for (int i = j; i < length - 1; i++) {
                if (a[j] > a[i + 1]) {
                    // change
                    temp = a[j];
                    a[j] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
