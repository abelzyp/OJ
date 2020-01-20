package LeetCode.Q0006_ZigzagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路：
 * 字符串被分为几行，就定义一个大小为几的数组。
 * 然后正反循环遍历字符串填入数组中。
 *
 * @author zhangyupeng
 * @date 2020/1/20
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }
}