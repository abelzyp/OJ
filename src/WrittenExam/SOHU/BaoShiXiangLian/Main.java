package WrittenExam.SOHU.BaoShiXiangLian;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (!str.contains("A") && str.contains("B") && str.contains("C") && str.contains("D")
					&& str.contains("E")) {
				System.out.println(0);
				return;
			}
			
		}
		sc.close();
	}
}
