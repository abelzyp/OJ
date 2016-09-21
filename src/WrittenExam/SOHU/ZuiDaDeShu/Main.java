package WrittenExam.SOHU.ZuiDaDeShu;

import java.util.Scanner;

public class Main {
	public static String Delete(String a, int k) {
		StringBuffer sb = new StringBuffer(a);
		int i, j;
		for (i = 0; i < k; i++) {
			for (j = 0; j < sb.length() - 1 && sb.charAt(j) >= sb.charAt(j + 1); j++) {
			}
			sb.delete(j, j + 1);
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			String a = input.nextLine();
			int k = Integer.parseInt(input.nextLine());
			String res = Delete(a, k);
			System.out.println(res);
		}
		input.close();
	}
}