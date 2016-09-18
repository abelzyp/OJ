package WrittenExam.Hytera.ShuiXianHuaShu;

/*
 * 根据维基百科中定义
 * 		严格意义来说水仙花数指三位数。
 * 
 * 则，只有 153 370 371 407
 */
public class NarcissisticMumber {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				for (k = 0; k <= 9; k++) {
					if (i * i * i + j * j * j + k * k * k == i * 100 + j * 10 + k)
						System.out.println(i * 100 + j * 10 + k);
				}
			}
		}
	}
}
