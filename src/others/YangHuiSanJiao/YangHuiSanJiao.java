package others.YangHuiSanJiao;

public class YangHuiSanJiao {
	public static void main(String[] args) {
		int n = 5;// 自己定义想输出几行的杨辉三角
		int[][] arr = createTriangle(n);
		printTriangle1(arr);
		printTriangle2(arr);
	}

	// 要构建这个三角，首先需要构造一个行为n的数组
	private static int[][] createTriangle(int n) {
		int[][] triangle = new int[n][];
		for (int i = 0; i < n; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}
		return triangle;
	}

	// 要遍历二维数组，需要两个循环
	private static void printTriangle1(int[][] triangle) {
		for (int r = 0; r < triangle.length; r++) {
			for (int c = 0; c < triangle[r].length; c++) {
				System.out.printf("%4d", triangle[r][c]);
			}
			System.out.println();
		}
	}

	// 一个更牛逼的方法遍历二维数组
	private static void printTriangle2(int[][] triangle) {
		for (int[] row : triangle) {
			for (int element : row) {
				System.out.printf("%4d", element);
			}
			System.out.println();
		}
	}
}
