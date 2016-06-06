package others;

import java.util.Scanner;

/**
 * 猜数字小游戏
 * @author zhangzhang
 *
 */
public class GuessNumber {

	public static void main(String[] args) {
		int number = (int) (Math.random()*100);
		
		while(true){
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if (num > number) {
				System.out.println("输入的数据" + num + "过大。");
			} else if (num < number) {
				System.out.println("数据的数据" + num + "过小。");
			} else {
				System.out.println("正确");
				break;
			}
		}
	}

}
