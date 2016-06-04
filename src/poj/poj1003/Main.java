package poj.poj1003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double num = in.nextDouble();
			if (num == 0) {
				return;
			}
			if (num <= 0.5) {
				System.out.println("1 card(s)");
				continue;
			}
			double sum = 0.5;
			int n = 2;
			int c = 1;
			do {
				n++;
				c++;
				sum += 1.0 / n;
			} while (sum < num);
			System.out.println(c + " card(s)");
		}
	}

}
