package WrittenExam.SOHU.DaiShuGuoHe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int step = arr[0];
		if (step == 0) {
			System.out.println(-1);
			return;
		}
		int res = 1;
		for (int i = step; i < N; i += step) {
			if (arr[i] == 0) {
				System.out.println(-1);
				return;
			}
			res++;
			step = arr[i];
		}
		System.out.println(res);
	}
}
