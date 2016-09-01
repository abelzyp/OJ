package WrittenExam.Tencent.LuoXuanJuZhen;

public class LuoXuanJuZhen {
	public static void main(String[] args) {
		printArray(luoxuan(5));
		
        /* 输出结果
         * 1  2  3  4  5
         * 16 17 18 19 6
         * 15 24 25 20 7
         * 14 23 22 21 8
         * 13 12 11 10 9
         */
	}
	
	/**
     * 根据输入的参数n得到一个螺旋的n*n的矩阵
     * 比如n=3，那么结果为
     * 1 2 3
     * 8 9 4
     * 7 6 5
     * 
     * @param n 矩阵阶数大小
     * @return 返回螺旋矩阵
     */
	public static int[][] luoxuan(int n) {
		int[][] arr = new int[n][n];
		if (n == 1) {// 如果为1阶的就没必要计算了
			arr[0][0] = 1;
			return arr;
		}
		int shu = 1;// 用于填充矩阵的数
		int qs = n - 2;// 圈数，n阶的矩阵，总共有n-2圈
		for (int i = 0; i <= qs; i++) {// 从最外圈qs=0开始循环，一圈圈往里循环
			int index = n - i;// 在当前的圈中最大下标数，
			int j;
			int k;
			for (j = i; j < index; j++) {// 当前圈中，最上面的行
				arr[i][j] = shu;
				shu++;
			}
			for (j--, k = i + 1; k < index; k++) {// 当前圈中，右侧列
				arr[k][j] = shu;
				shu++;
			}
			for (j--, k--; j > i; j--) {// 当前圈，下面的行
				arr[k][j] = shu;
				shu++;
			}
			for (; k > i; k--) {// 当前圈左侧的列
				arr[k][j] = shu;
				shu++;
			}
		}
		return arr;
	}
 
    /**
     * 输出矩阵的内容
     * @param arr
     */
	public static void printArray(int[][] arr) {
		int len = arr.length;
		for (int l = 0; l < len; l++) {
			for (int m = 0; m < len; m++) {
				System.out.print(arr[l][m] + "\t");
			}
			System.out.println();
		}
	}
}
