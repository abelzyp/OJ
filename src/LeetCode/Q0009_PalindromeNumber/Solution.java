package LeetCode.Q0009_PalindromeNumber;

/**
 * @author zhangyupeng
 * @date 2020/1/20
 */
public class Solution {
    public boolean isPalindrome(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}