package WrittenExam.DiDi.JinZhiZhuanHuan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			String ori = str.substring(2);
			int res = 0;
			for (int i = 0; i < ori.length(); i++) {
				char ch = ori.charAt(i);
				switch (ch) {
				case 'A':
					res = res * 16 + 10;
					break;
				case 'B':
					res = res * 16 + 11;
					break;
				case 'C':
					res = res * 16 + 12;
					break;
				case 'D':
					res = res * 16 + 13;
					break;
				case 'E':
					res = res * 16 + 14;
					break;
				case 'F':
					res = res * 16 + 15;
					break;
				default:
					int tmp = Integer.parseInt(String.valueOf(ch));
					res = res * 16 + tmp;
					break;
				}
			}
			System.out.println(String.valueOf(res));
		}
	}
}
