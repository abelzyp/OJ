package CodingInterviews.Q52;

/*
 * 构建乘积数组
 * 		给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 		其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Solution {
	public int[] multiply(int[] A) {
		int len = A.length;
		int[] B = new int[len];
		int[] forward = new int[len];
		int[] backword = new int[len];
		forward[0] = 1;
		backword[0] = 1;
		for (int i = 1; i < len; i++) {
			forward[i] = A[i - 1] * forward[i - 1];
			backword[i] = A[len - i] * backword[i - 1];
		}
		for (int i = 0; i < len; i++) {
			B[i] = forward[i] * backword[len - i - 1];
		}
		return B;
	}
}
