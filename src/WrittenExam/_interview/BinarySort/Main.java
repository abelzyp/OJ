package WrittenExam._interview.BinarySort;

import java.util.Scanner;

/**
 * 计算数组的小和
 * 数组小和的定义如下：
 * 例如，数组s = [1, 3, 5, 2, 4, 6]，
 * 在s[0]的左边小于或等于s[0]的数的和为0；
 * 在s[1]的左边小于或等于s[1]的数的和为1；
 * 在s[2]的左边小于或等于s[2]的数的和为1+3=4；
 * 在s[3]的左边小于或等于s[3]的数的和为1；
 * 在s[4]的左边小于或等于s[4]的数的和为1+3+2=6；
 * 在s[5]的左边小于或等于s[5]的数的和为1+3+5+2+4=15。
 * 所以s的小和为0+1+4+1+6+15=27
 * 给定一个数组s，实现函数返回s的小和
 * 输入描述:
 * 第一行有一个整数N。表示数组长度
 * 接下来一行N个整数表示数组内的数
 * 输出描述:
 * 一个整数表示答案
 * [要求]
 * 时间复杂度为O(nlogn)，空间复杂度为O(n)
 * 输入
 * [1,3,5,2,4,6]
 * 输出
 * 27
 *
 * @author Zhang
 * @since 2021/3/23
 */
public class Main {

    public static void main(String[] args) {
//        int[] a = {1, 3, 5, 2, 4, 6};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(minSum(a));
    }

    private static int minSum(int[] a) {
        int minSum = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] <= a[i]) {
                    minSum += a[j];
                }
            }
        }
        return minSum;
    }
}