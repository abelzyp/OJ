package WrittenExam.NetEase.ShuZiFanZhuan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x < 1 || x > 1000 || y < 1 || y > 1000)
			return;
		System.out.println(Rev(Rev(x) + Rev(y)));
	}

	private static int Rev(int X) {
		return Integer.parseInt(new StringBuilder(String.valueOf(X)).reverse().toString());
	}
}
