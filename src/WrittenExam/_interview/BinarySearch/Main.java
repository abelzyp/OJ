package WrittenExam._interview.BinarySearch;

import java.util.Scanner;

/**
 * 二分查找
 * 请实现有重复数字的有序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 * 输入
 * 5,4,[1,2,4,4,5]
 * 输出
 * 3
 *
 * @author Zhang
 * @since 2021/3/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(search(n, v, a));
    }

    /**
     * @param n 数组长度
     * @param v 给定需要查找的值
     * @param a 数组
     * @return 数组中第一个大于等于查找值的位置
     */
    private static int search(int n, int v, int[] a) {
        if (v > a[n - 1]) {
            return n + 1;
        }

        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        while (start < end) {
            if (v <= a[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return mid + 1;
    }
}