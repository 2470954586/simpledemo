package company.面试基础;

public class 全排列 {
    public static void main(String[] args) {
      char[] arr = {'A', 'B', 'C'};
//        int[] arr = {1, 2, 3, 4};

        fullSort(arr, 0, arr.length - 1);
    }

    public static void fullSort(char[] arr, int start, int end) {
        // 递归终止条件
        if (start == end) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            fullSort(arr, start + 1, end);
            swap(arr, i, start);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
