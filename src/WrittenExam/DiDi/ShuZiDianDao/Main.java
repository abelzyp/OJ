package WrittenExam.DiDi.ShuZiDianDao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		sb.reverse();
		System.out.println(sb.toString());
	}
}
