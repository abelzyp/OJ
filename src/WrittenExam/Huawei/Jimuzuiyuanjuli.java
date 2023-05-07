package WrittenExam.Huawei;

import java.util.HashMap;
import java.util.Scanner;

/**
 * [积木最远距离](https://blog.csdn.net/weixin_45541762/article/details/129964454)
 * <p>
 * 小华和小薇一起通过玩积木游戏学习数学。
 * 他们有很多积木，每个积木块上都有一个数字，积木块上的数字可能相同。
 * 小华随机拿一些积木挨着排成一排，请小薇找到这排积木中数字相同且所处位置最远的2块积木块，计算他们的距离。
 * 小薇请你帮忙替解决这个问题。
 * <p>
 * 输入描述：
 * 第一行输入为N，表示小华排成一排的积木总数。接下来N行每行一个数字，表示小华排成一排的积木上数字。
 * 输出描述：
 * 相同数字的积木的位置最远距离；如果所有积木数字都不相同，请返回-1。
 * <p>
 * 输入：5 1 2 3 1 4
 * 输出：3
 * --------------------
 * 思路：
 * 1.用maxDistance记录数字两个相同数字的最远距离，初始化为-1。
 * 2.使用一个HashMap cntMap记录数组中第一次出现某个数字的位置，即key为数字本身，value为所在数组索引下标。
 * 在遍历过程中，
 * 1、在cntMap中查找是否有thisIn，如果没有出现过则将{thisIn, i}添加到cntMap中
 * 2、如果cntMap中已经存在thisIn，判断当前索引下标i减去thisIn第一次出现的下标是否大于maxDistance，如果大于则maxDistance = i - firstAppear
 * 遍历完数组，返回maxDistance即可。
 * 注意两点：
 * A、如果nums[i]中不存在两个相同的数，则返回-1，cntMap的长度和nums长度相同。
 * B、由于题目备注中的积木上的数字最大为10^9，积木长度最大为10^5，超过了int的最大范围，需要使用long表示数字。
 */
public class Jimuzuiyuanjuli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long maxDistance = -1;
        HashMap<Long, Long> cntMap = new HashMap<>();
        for (long i = 0; i < n; i++) {
            long thisIn = scanner.nextLong();
            Long firstAppear = cntMap.get(thisIn);
            if (null == firstAppear) {
                cntMap.put(thisIn, i);
            } else {
                //之前已经有过该数字，则更新相同数字的最远积木距离
                if (i - firstAppear > maxDistance) {
                    maxDistance = i - firstAppear;
                }
            }
        }
        System.out.println(maxDistance);
    }
}
