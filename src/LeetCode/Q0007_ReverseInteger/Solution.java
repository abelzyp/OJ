package LeetCode.Q0007_ReverseInteger;

public class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        //这块判断溢出的比较巧妙
        return (int) res == res ? (int) res : 0;
    }
}