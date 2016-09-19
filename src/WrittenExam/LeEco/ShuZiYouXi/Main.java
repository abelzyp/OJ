package WrittenExam.LeEco.ShuZiYouXi;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 通过率20%
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if (n < 0 || n > 1000000000 || m < 0 || m > 1000000000)
				return;

			char[] chs = String.valueOf(n).toCharArray();
			Arrays.sort(chs);

			char idx = 0;
			while (chs[idx] == '0') {
				idx++;
			}
			char tmp = chs[0];
			chs[0] = chs[idx];
			chs[idx] = tmp;

			int res = Integer.parseInt(String.valueOf(chs));
			if (res == m) {
				System.out.println("YES");
				continue;
			} else {
				System.out.println("NO");
				continue;
			}
		}
	}
}
