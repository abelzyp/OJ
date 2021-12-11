package WrittenExam.Huawei.ArrayDiff;

import java.util.Scanner;

/**
 * 求数组中两个元素差的最大值（后面的元素减去前面的元素）
 * 对应实际生活中的股票买卖，找出可能的最大收益；
 * <p>
 * [8,9,2,5,4,7,1] -> 5
 *
 * @author Piao
 * @since 2021/12/11
 */
public class Price {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0 || n > 10000) {
            System.out.println("长度不合法");
            return;
        }
        // 定义price数组
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = s.nextInt();
            // 同时校验价格合法性
            if (price[i] < 0 || price[i] > 10000) {
                System.out.println("价格不合法");
                return;
            }
        }

        int output = maxDiff(price);
        System.out.println("最大收益:" + output);
    }

    private static int maxDiff(int[] price) {
        int len = price.length;
        if (len < 2) {
            return 0;
        }
        int min = Math.min(price[0], price[1]);
        int maxDiff = price[1] - price[0];
        for (int i = 2; i < len; i++) {
            if (price[i] - min > maxDiff) {
                maxDiff = price[i] - min;
            }
            if (price[i] < min) {
                min = price[i];
            }
        }
        // 最大收益不能为负数
        return Math.max(maxDiff, 0);
    }
}
