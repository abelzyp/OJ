package LeetCode.Q0013_RomanToInteger;

/**
 * @author zhangyupeng
 * @date 2020/1/21
 */
public class Solution {
    //Roman
    //1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    //10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    //100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    //1000~3000: {"M", "MM", "MMM"}.

    /**
     * 从前向后遍历罗马数字，如果某个数不大于前一个数，则加上该数。反之，减去前一个数的两倍然后加上该数。
     * 基本字符	    I	V	X	L	C	D	M
     * 对应阿拉伯数字	1	5	10	50	100	500	1000
     */
    public int romanToInt(String s) {
        int res = toNum(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (toNum(s.charAt(i)) > toNum(s.charAt(i - 1))) {
                res += toNum(s.charAt(i)) - 2 * toNum(s.charAt(i - 1));
            } else {
                res += toNum(s.charAt(i));
            }
        }
        return res;
    }

    int toNum(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}