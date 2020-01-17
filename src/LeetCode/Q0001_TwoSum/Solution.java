package LeetCode.Q0001_TwoSum;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * You may assume that each input would have exactly one solution.
 *
 * @author zhangzhang
 *
 * 思路：
 * 1、定义一个数组和一个hashtable
 * 2、循环遍历这个数组，每次都判断当前数组索引位置的值在不在hashtable里：
 * 		a:不在的话，加入进去，key为数值，value为它的索引值
 * 		b:在的话，取得他的key，记为n（此时n一定小于循环变量i），接下来再在hashtable中查找（target-当前数值）这个数
 * 3、返回数组
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                index[0] = i;
                index[1] = hashMap.get(nums[i]);
                return index;
            }
            hashMap.put(target - nums[i], i);
        }
        return index;
    }
}
