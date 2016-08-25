package WrittenExam.ZTE.SanJiaoShuChu;

/*
 * 题目要求如下：
 * 		给定一个数n，输入如下：
 * 		如给定n=3，则输出为：
 * 			1*2*3*10*11*12
 * 			--4*5*8*9
 * 			----6*7
 */
public class Main {
	public static void main(String[] args) {
		ShuChu(3);
	}

	private static void ShuChu(int n) {
		int tmp = 1;
		int sum = n * n + n;
		String str = "";
		for (int i = n; i > 0; i--) {
			if (tmp != 1) {
				str += "--";
				System.out.print(str);
			}
			for (int j = 0; j < i; j++) {
				System.out.print(tmp + "*");
				tmp++;
			}
			sum = sum - i + 1;
			for (int k = 0; k < i - 1; k++) {
				System.out.print(sum + "*");
				sum++;
			}
			System.out.println(sum);
			sum -= i;
		}
	}
}
