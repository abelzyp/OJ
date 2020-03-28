package WrittenExam.Huawei.MergeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 归并两个升序list为1个升序list，时间和空间复杂度为O(n)
 *
 * @author zhangyupeng
 * @date 2020/3/28
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 4, 4, 5);
        List<Integer> b = Arrays.asList(1, 2, 2, 4, 5);
        System.out.println(merge(a, b));
    }

    /**
     * @param a 升序list a
     * @param b 升序list b
     * @return merge完成的升序list
     */
    private static List<Integer> merge(List<Integer> a, List<Integer> b) {
        //如果有一个list没元素,直接返回另一个
        if (a == null || a.size() == 0) {
            return b;
        }
        if (b == null || b.size() == 0) {
            return a;
        }
        //如果都不为空,定义两个指针
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>(a.size() + b.size());
        while (i < a.size() && j < b.size()) {
            //分情况判断
            if (a.get(i) < b.get(j)) {
                list.add(a.get(i));
                i++;
            } else if (a.get(i) > b.get(j)) {
                list.add(b.get(j));
                j++;
            } else {
                //比较的元素相同,归并后位置同时+1
                list.add(a.get(i));
                list.add(b.get(j));
                i++;
                j++;
            }
        }
        //补充其他元素进入归并数组 经过上述最小值归并 循环结束后必定有一数组已经完全归并结束
        while (i < a.size()) {
            list.add(a.get(i));
        }
        while (j < b.size()) {
            list.add(b.get(j));
        }
        return list;
    }
}