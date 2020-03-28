package WrittenExam.Huawei;

/**
 * 密码强度检查
 * 1.长度>=6并且<=20
 * 2.至少包含一个小写字符、一个大写字符、一个数字
 * 3.必须不连续包含三个重复的字符，("...aaa..."是弱安全的；满足1,2条件，"...aa..a..."是强安全的)
 *
 * @author piaomengyao
 * @date 2020/3/28
 */
public class Solution {

    public static void main(String[] args) {
        //测试用例
        System.out.println(strongPasswordChecker("aaa"));//-1
        System.out.println(strongPasswordChecker("aaaaaaa"));//-1
        System.out.println(strongPasswordChecker("AAAaaa"));//-1
        System.out.println(strongPasswordChecker("AAAaaa123"));//-1
        System.out.println(strongPasswordChecker("AAAAaaaA1"));//-1
        System.out.println(strongPasswordChecker("ABCDEFG123"));//-1
        System.out.println(strongPasswordChecker("ABCDEfg123"));//0
        System.out.println(strongPasswordChecker("AAaaAA1"));//0
    }

    /**
     * 密码强度检查函数
     *
     * @param password 需要校验的密码字符串
     * @return 如果强安全返回0，弱安全返回-1
     */
    private static int strongPasswordChecker(String password) {
        //判空及条件1
        if (null == password || password.length() < 6 || password.length() > 20) {
            return -1;
        }

        //条件2-大小写和数字
        boolean xiaoxie = false;
        boolean daxie = false;
        boolean shuzi = false;
        //条件3-重复字符
        boolean lianxu = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            //判断小写
            if ('a' <= ch && ch <= 'z') {
                xiaoxie = true;
            }
            //判断大写
            if ('A' <= ch && ch <= 'Z') {
                daxie = true;
            }
            //判断数字
            if (48 <= ch && ch <= 57) {
                shuzi = true;
            }

            //前两个连续肯定没问题，从第三个就得开始判断了
            if (i < 2) {
                continue;
            }
            //判断连续
            char ch_2 = password.charAt(i - 2);
            char ch_1 = password.charAt(i - 1);
            if (ch == ch_1 && ch_1 == ch_2) {
                lianxu = true;
            }
        }
        boolean strong = xiaoxie && daxie && shuzi && !lianxu;
        return strong ? 0 : -1;
    }
}