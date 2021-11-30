package WrittenExam.Huawei.MaxArray;

/**
 * 给你一个整形数组，要求删除其中一个元素，使得剩余元素的乘积最大。如何找到这个待删除元素？
 * <p>
 * 分析情况：当数组中有负数的情况 和 没有负数的情况
 * 1.当数组中全是正整型的值，就取其中最小的值
 * 2.当数组中有负数的情况时候
 * - 奇数个数的负数 -> 取最小的负数
 * - 偶数个数的负数 -> 取正整数最小的值
 *
 * @author Zhang Yupeng
 * @since 2021/12/1
 */
public class Solution {

    /**
     * 返回要删除的元素的下标
     */
    public static int findRemoveIndex(int[] nums) {

        // 统计负数的个数
        int negativeCount = 0;

        for (int num : nums) {
            // 有负数就+1
            if (num < 0) {
                negativeCount++;
            }
        }

        //根据不同的情况，选择要删除的元素
        int tempIndex = 0;

        if ((negativeCount & 1) == 1) {
            //情况1：负数个数是奇数,就移除最大的负数
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    //解释： 因为是奇数个所以直接取值为负数的 num[i]，减少判断
                    // 如果 tempIndex 即第一个值是整数，那么毫无疑问，就将当前的index,赋给temIndex
                    //  nums[i]当前的负数 与 tempIndex的负数比较 最大的负数，就重新复制给tempIndex
                    if (nums[tempIndex] >= 0 || nums[i] > nums[tempIndex]) {
                        tempIndex = i;
                    }
                }
            }
        } else {
            //情况2：负数个数是偶数

            //2.1 所有的元素都是负数
            if (nums.length == negativeCount) {
                // 因为是偶数，所以，只需要找出 最小的值
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] < nums[tempIndex]) {
                        tempIndex = i;
                    }
                }
                return tempIndex;
            }


            //2.2 部分(偶数个)是负数 或者 没有负数的情况
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= 0) {
                    if (nums[tempIndex] < 0 || nums[i] < nums[tempIndex]) {
                        tempIndex = i;
                    }
                }
            }
        }
        return tempIndex;
    }

    public static void main(String[] args) {
        int[] arrays1 = {12, -3, 5, -6, 7, 8, -9, 7};
        int index = findRemoveIndex(arrays1);
        // 应该移除 -3
        System.out.println("删除元素的下标：" + arrays1[index]);

        int[] arrays2 = {-12, -3, -5, -6, -7, -8, -9, 8};
        index = findRemoveIndex(arrays2);
        // 应该移除 -3
        System.out.println("删除元素的下标：" + arrays2[index]);


        int[] arrays3 = {-12, -3, -5, -6, 7, 8, 9, 3};
        index = findRemoveIndex(arrays3);
        // 应该移除 3
        System.out.println("删除元素的下标：" + arrays3[index]);
    }
}
