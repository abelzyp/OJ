package WrittenExam.DiDi;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出数组中出现次数超过一半的数
 * <p>
 * 思路：用HashMap的key存储数组中具体元素，value存储该元素出现的次数。
 * 如果集合中还没有该元素，即:!map.containskey(arry[i])  则把该元素出现次数记为1，否则在之前次数上加1。
 * 之后用for循环遍历该集合，如果map1.getValue>num，则可以用map1.getKey取出这个出现次数超过一半的数。
 * <p>
 * 该算法时间复杂度为O(n)，其中n为数组arr的长度，因为有一个循环遍历数组，另一个循环遍历map，但是由于map的key不会超过n，因此不影响时间复杂度的量级。因此，该算法的时间复杂度为O(n)。
 * 该算法的空间复杂度主要取决于创建的HashMap，它存储输入数组中元素对应的出现次数。因此，空间复杂度为O(n)，n为输入数组的长度。即使每个元素都只出现一次，HashMap的大小也为n，所以空间复杂度不会更低。
 *
 * @author Zhang
 * @since 2023/3/29
 */
public class FindMoreHalf {
    public static void main(String[] args) {
        int[] arry = {5, 2, 3, 5, 5, 6, 1, 5, 5};
        System.out.println(findMoreHalf(arry));

    }

    public static int findMoreHalf(int[] arry) {
        Integer num = arry.length / 2;
        Integer key;
        Map<Integer, Integer> maps = new HashMap<>();
        for (int j : arry) {
            if (!maps.containsKey(j)) {
                maps.put(j, 1);
            } else {
                maps.put(j, maps.get(j) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
            if (map.getValue() > num) {
                key = map.getKey();
                return key;
            }
        }
        return -1;
    }
}
