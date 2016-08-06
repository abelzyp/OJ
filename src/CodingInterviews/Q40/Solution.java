package CodingInterviews.Q40;

/*
 * 数组中只出现一次的数字
 */
public class Solution {
	// num1,num2分别为长度为1的数组。传出参数
	// 将num1[0],num2[0]设置为返回结果
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length == 0)
			return;
		int resXOR = 0;
		for (int i = 0; i < array.length; i++) {
			resXOR ^= array[i];
		}
		int indexOf1 = FindFirstBitIs1(resXOR);
		num1[0] = num2[0] = 0;
		for (int j = 0; j < array.length; j++) {
			if (isBit1(array[j], indexOf1)) {
				num1[0] ^= array[j];
			} else {
				num2[0] ^= array[j];
			}
		}
	}

	private boolean isBit1(int num, int indexBit) {
		num = num >> indexBit;
		return (num & 1) == 1;
	}

	private int FindFirstBitIs1(int resXOR) {
		int indexBit = 0;
		while ((resXOR & 1) == 0) {
			resXOR = resXOR >> 1;
			indexBit++;
		}
		return indexBit;
	}
}
