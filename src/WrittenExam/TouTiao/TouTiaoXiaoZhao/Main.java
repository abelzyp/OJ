package WrittenExam.TouTiao.TouTiaoXiaoZhao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int n = Integer.parseInt(in.nextLine());
			String s[] = in.nextLine().split(" ");
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			Arrays.sort(a);
			int count = 0;
			int i = 0;
			boolean flag1 = false;
			boolean flag2 = false;
			while (i < n - 2) {
				flag1 = false;
				flag2 = false;
				int tmp1 = a[i];
				int tmp2 = a[i + 1];
				int tmp3 = a[i + 2];
				if (tmp2 - tmp1 > 20) {
					count = count + 2;
					flag2 = true;
					i++;
				} else {
					if (tmp2 - tmp1 > 10) {
						count++;
						i = i + 2;
						flag1 = true;
					} else {
						if (tmp3 - tmp2 > 10) {
							count++;
							i = i + 2;
							flag1 = true;
						} else {
							i = i + 3;
						}
					}
				}
			}
			if (i == n) {
				System.out.println(count);
			} else {
				if (i == n - 1) {
					System.out.println(count + 2);
				} else {
					if (i == n - 2) {
						if (a[i + 1] - a[i] > 20)
							System.out.println(count + 4);
						else
							System.out.println(count + 1);
					}
				}
			}
		}
	}
}
