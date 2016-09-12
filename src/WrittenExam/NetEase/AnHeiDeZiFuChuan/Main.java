package WrittenExam.NetEase.AnHeiDeZiFuChuan;

import java.util.Scanner;

/*
 * 此题有问题
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 1 || n > 30)
			return;
		if (n == 1 || n == 2) {
			System.out.println((int) Math.pow(3, n));
			return;
		}
		System.out.println((int) (Math.pow(3, n) - 6 * Math.pow(3, n - 3)));
	}
}
