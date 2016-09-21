package WrittenExam.SOHU.DaiShuGuoHe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		while (in.hasNext()) {
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = in.nextInt();
			}

			System.out.println(jumpCount(nums));
		}
	}

	public static int jumpCount(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;

		int jumpCount = 0;

		int lastJump = 0;
		int jump = 0;
		for (int position = 0; position <= jump && position < nums.length; position++) {
			if (position == jump && position == nums.length - 1) {
				jumpCount++;
			}

			if (position > lastJump) {
				jumpCount++;
				lastJump = jump;
			}
			jump = Math.max(jump, nums[position] + position);
		}

		if (jump < nums.length - 1)
			return -1;

		return jumpCount;
	}
}
