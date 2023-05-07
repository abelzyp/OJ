package WrittenExam.Huawei;

import java.util.Scanner;

/**
 * [贪心的商人](https://blog.csdn.net/weixin_45541762/article/details/130302371)
 * 商人经营一家店铺，有number种商品，由于仓库限制每件商品的最大持有数量是 item[index],
 * 每种商品的价格在每天是item price[item index][day],通过对商品的买进和卖出获取利润，
 * 请给出商人在days天内能获取到的最大的利润；
 */
public class Tanxindeshangren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // 输入商品数量
        int days = sc.nextInt(); // 输入天数
        int[] item = new int[number]; // 定义商品数量数组
        for (int i = 0; i < number; i++) {
            item[i] = sc.nextInt(); // 输入每个商品的数量
        }
        int[][] item_price = new int[number][days]; // 定义商品价格二维数组
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < days; j++) {
                item_price[i][j] = sc.nextInt(); // 输入每个商品每天的价格
            }
        }
        int res = 0; // 定义总利润
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < days - 1; j++) {
                int purchase = item_price[i][j]; // 进价
                int selling = item_price[i][j + 1]; // 卖价
                if (selling > purchase) { // 当卖价大于进价才有利润
                    res += (selling - purchase) * item[i]; // 计算利润并加入总利润
                }
            }
        }
        System.out.println(res); // 输出总利润
    }
}
