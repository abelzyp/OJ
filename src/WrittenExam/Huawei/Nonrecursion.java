package WrittenExam.Huawei;

/**
 * 非递归实现全排列
 * 这种方法的前提要求我们需要对数组进行排序，我们可以使用JAVA Array.sort() 方法解决。
 * 非递归实现的思想就在于，我们先从最小的排序开始，依次寻找比当前排序大的最小排序，实现该方法的关键就在于寻找交换点和交换数。
 */
public class Nonrecursion {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        new Nonrecursion().nextPermutation(nums);

    }

    public void nextPermutation(int[] nums) {
        int index = 0; //交换点下标
        int swapNums = 0;
        while (true) {
            for (int num : nums) System.out.print(num + "\t");
            System.out.println();

            // Firstly, we need to find the swap point (index)
            // 从右向左，循环比较相邻的两个数，找到第一个非递增的数，即为交换点（index）
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    index = i;
                    break;
                }
                if (i == 0) return; //没有找到需要交换的点，即交换全部完成，退出循环
            }

            // Secondly, we need to find swap number
            // 从右向左找第一个比交换点所在的数大的数， 该数即为需要和交换点交换的数
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[index] < nums[j]) {
                    swapNums = j;
                    break;
                }
            }

            // Thirdly, swap the two numbers
            swap(nums, index, swapNums);

            //Fourthly, put the numbers after index in positive order
            //目的在于保证当前排序是比上一个排序大的最小的一个排序
            reverse(nums, index + 1);
        }
    }

    //交换两个元素
    public void swap(int[] nums, int index, int j) {
        int temp = nums[index];
        nums[index] = nums[j];
        nums[j] = temp;
    }

    //将 index 后的数正序排序，这样就使得这种排序是当前情况下最小的
    private void reverse(int[] nums, int i) {
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
            // swap(nums, i++, j--);
        }
    }
}
