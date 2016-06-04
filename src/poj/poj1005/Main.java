package poj.poj1005;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final double PI = 3.1415926;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int year;
		for(int i = 1;i<=n;i++){
			double x = in.nextDouble();
			double y = in.nextDouble();
			year = (int) ((x*x+y*y)*PI/100.0+1.0);
			System.out.println("Property "+i+": This property will begin eroding in year "+year+".");
		}
		System.out.println("END OF OUTPUT.");
	}

}
