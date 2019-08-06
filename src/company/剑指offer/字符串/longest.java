package company.剑指offer.字符串;

import java.util.Arrays;

/*
*  编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
*输入: ["flower","flow","flight"]
输出: "fl"
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
* */
public class longest {
    public String replace(String[] strs) {
        if (!checkStrs(strs)) {
            return " ";
        }
        int len = strs.length;
        StringBuffer res = new StringBuffer();
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len - 1].length();
        int num = Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                res.append(strs[0].charAt(i));
            } else break;
        }
        return   res.toString();
    }

    private boolean checkStrs(String[] strs) {
        boolean flag = false;
        if (strs != null) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] != null && strs[i].length() != 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String[] strs = {"caustom", "gcar", "rcafaf"};
        longest longest = new longest();
        System.out.println(longest.replace(strs));
    }

}
