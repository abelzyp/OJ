package WrittenExam.Huawei.BirthdayGift;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 小明周末过生日，妈妈让他去选3个礼物，但是价格不能超过100元，超市的东西很多，价格也有重复的。
 * 请帮小明设计一个算法，在礼物总价不超过100元的前提下，最多的使用100元。
 * 输入:
 * 第一行为商品个数N，0<N<=1000
 * 第二行为N个商品的价格，每个价格之间用空格隔开
 * 输出：
 * 如果100元无法购买到3件礼物，输出 It is too expensive!
 * 如果可以购买，则输出3件礼物花费的金额。
 * 示例1：
 * 输入
 * 5
 * 1 2 3 4 5
 * 输出
 * 12
 * 说明：3+4+5=12，100元内最高购买的礼物价格是12元
 * 示例2：
 * 输入
 * 4
 * 80 90 78 20
 * 输出
 * It is too expensive!
 * 说明
 * 3件商品最少情况下是20+78+80=178，无法购买
 *
 * @author Zhang Yupeng
 * @since 2021/11/3
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> priceList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            priceList.add(in.nextInt());
        }
        // 价格从大到小排序
        priceList.sort((o1, o2) -> o2 - o1);

        int sum = 0;
        //挑选三件商品,总价不超100
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + i; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    Integer a = priceList.get(i);
                    Integer b = priceList.get(j);
                    Integer c = priceList.get(k);
                    int tmp = a + b + c;
                    if (sum < tmp && tmp <= 100) {
                        sum = tmp;
                    }
                }
            }
            if (sum > 0) {
                System.out.println(sum);
            } else {
                System.out.println("It is too expensive!");
            }
        }
    }
}
