package WrittenExam.Huawei;

import java.util.*;

/**
 * [求最大数字](https://blog.csdn.net/weixin_45541762/article/details/130118084)
 * 给定一个由纯数字组成以字符串表示的数值，现要求字符串中的每个数字最多只能出现2次，超过的需要进行删除；
 * 删除某个重复的数字后，其它数字相对位置保持不变。
 * 如”34533”，数字3重复超过2次，需要删除其中一个3，删除第一个3后获得最大数值”4533”请返回经过删除操作后的最大的数值，以字符串表示。
 */
public class Qiuzuidashuzi {
    public static List<Integer> resList = new ArrayList<>(); //存储所有满足条件的数字
    public static String[] inputStrs; //存储用户输入的字符串

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputStrs = sc.nextLine().split(""); //读取用户输入的字符串
        Map<String, Integer> map = new HashMap<>();
        for (String inputStr : inputStrs) { //求出所有数字的出现次数
            map.put(inputStr, map.getOrDefault(inputStr, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            String num = m.getKey();
            list.add(num);
            if (m.getValue() >= 2) { //次数大于等于2 只记两次
                list.add(num);
            }
        }
        String[] strsNum = new String[list.size()];
        list.toArray(strsNum); //集合转化为数组
        combine(strsNum, 0, strsNum.length - 1); //对数组进行全排列
        Collections.sort(resList); //将所有满足条件的数字排序
        System.out.println(resList.get(resList.size() - 1)); //输出最大的数字
    }

    /**
     * 对存在的数字进行全排列，找出其中最大的值
     *
     * @param strs  存在数字数组
     * @param start 进行交换的index
     * @param end   数组的最后一个index
     */
    private static void combine(String[] strs, int start, int end) {
        if (start == end) {
            StringBuilder numStr = new StringBuilder();
            for (String s : strs) {
                numStr.append(s); //将数组中的数字进行拼接
            }
            if (!resList.contains(Integer.valueOf(numStr.toString())) && isChild(strs)) { //剔除满足子串且存在的数字
                resList.add(Integer.valueOf(numStr.toString())); //将满足条件的数字加入 resList 中
            }
        } else {
            for (int i = start; i < strs.length; i++) {
                if (i != start && strs[i].equals(strs[start])) { //用来交换的索引不同且数字相等则重复
                    continue;
                }
                swap(strs, i, start);
                if (strs[0].equals("0")) {
                    continue; //首位为0 不满足
                }
                combine(strs, start + 1, end);
                swap(strs, i, start);
            }
        }
    }

    /**
     * 判断数组是否为输入数组的子串
     */
    private static boolean isChild(String[] child) {
        int index = 0; //父数组索引
        boolean isOver = false; //父数组是否遍历结束
        int count = 0;
        for (String str : child) {
            for (int j = index; j < inputStrs.length; j++) {
                String temp = inputStrs[j];
                if (j == inputStrs.length - 1) {
                    isOver = true; //父数组遍历结束了
                }
                if (temp.equals(str)) {
                    index = j + 1; //存在该字符，则更新count
                    count++;
                    break;
                }
            }
            if (isOver) { //父数组遍历完成且index 没有刷新
                break;
            }
        }
        return count == child.length;
    }

    private static void swap(String[] strings, int indexa, int indexb) {
        String temp = strings[indexa];
        strings[indexa] = strings[indexb];
        strings[indexb] = temp;
    }
}
