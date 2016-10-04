package WrittenExam.LianJia.SuiJiDaLuan;

import java.util.Random;

/*
 * 给定1,2,3...100,随机打乱这100个数字。
 */
public class Main {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 1; i <= 100; i++) {
			arr[i - 1] = i;
		}
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int ran = r.nextInt(100);

			int tmp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = tmp;
		}
		for (int i = 0; i < 100; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
