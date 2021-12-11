package WrittenExam.Huawei.HuiWenString;

import java.util.Scanner;

/**
 * @author Piao
 * @since 2021/12/11
 */
public class HuiWenString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        if (ss == null || ss.length() == 0 || ss.length() > 1_000_000) {
            System.out.println("输入长度范围有误");
        } else if (huiwen(ss)) {
            System.out.println("是回文字符串");
        } else {
            System.out.println("不是是回文字符串");
        }
    }

    public static boolean huiwen(String ss) {
        for (int i = 0; i < ss.length() / 2; i++) {
            if (ss.charAt(i) != ss.charAt(ss.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
