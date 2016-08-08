package others.QingXieBianLiErWeiShuZu;

public class FanXieXian {
	public static String BianLi(int[][] arr, int n) {
		StringBuilder sb = new StringBuilder();
		int dif = n;// 记录横纵坐标差
		// 先遍历左上部分
		for (int t = dif; t >= 0; t--) {
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					if (j - i == t)
						sb.append(arr[i][j]);
				}
			}
		}
		// 再遍历右下部分
		for (dif = 1; dif < n; dif++) {
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < i; j++) {
					if (i - j == dif)
						sb.append(arr[i][j]);
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int n = 4;
		System.out.println(FanXieXian.BianLi(arr, n));
	}
}
