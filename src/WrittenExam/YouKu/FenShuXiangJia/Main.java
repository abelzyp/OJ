package WrittenExam.YouKu.FenShuXiangJia;

/*
 * 已知：Sn= 1＋1／2＋1／3＋…＋1／n。
 * 显然对于任意一个整数K，当n足够大的时候，Sn大于K。 
 * 现给出一个整数K（1<=k<=15），要求计算出一个最小的n；使得Sn＞K。
 */
public class Main {
	public static void main(String[] args) {
		int k = 10;
		double n = 1;
		double sum = 0;
		while (sum < k) {
			sum += 1 / n;
			n++;
		}
		System.out.println((int) n - 1);
	}
}
