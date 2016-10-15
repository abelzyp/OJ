package WrittenExam.YouKu.JieChengWeiShu;

/*
 * HDOJ 1066阶乘最后一个非零位
 */
public class Main {
	public static void main(String[] args) {
		int n = 7;

		int[] arr_of_2 = { 6, 8, 4, 2 };
		int result = 1;
		int num_of_5 = 0;
		while (n > 0) {
			switch (n % 5) {
			case 2:
				result *= 2;
				break;
			case 4:
				result *= 4;
				break;
			}
			result %= 5;
			n /= 5;
			num_of_5 += n;
			if ((n & 1) != 0)
				result = (result * 4) % 5;
		}

		if ((result & 1) != 0)
			result += 5;
		result *= arr_of_2[num_of_5 % 4];
		result %= 10;
		System.out.println(result);
	}
}
