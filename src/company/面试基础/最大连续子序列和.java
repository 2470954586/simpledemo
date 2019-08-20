package company.面试基础;

public class 最大连续子序列和 {
    public static void main(String[] args) {
        int[] a = {1,-2,3,10,-4,7,2,-5};
        int max = maxSubSum1(a);
        System.out.println(max);
        // 21
    }

    private static int maxSubSum1(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += a[k];
                }
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }
}
