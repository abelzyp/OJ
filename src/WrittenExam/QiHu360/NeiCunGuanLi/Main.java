package WrittenExam.QiHu360.NeiCunGuanLi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * 输入：
 * 		6 10
 *		new 5
 *		new 3
 *		del 1
 *		new 6
 *		def
 *		new 6
 *
 *输出：
 *		1
 *		2
 *		NULL
 *		3
 *
 * 注：此题代码有问题。
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int MaxMem = sc.nextInt();
		if (T < 1 || T > 10000 || MaxMem < 1 || MaxMem > 10000)
			return;

		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] size = new int[MaxMem];
		for (int i = 0; i < MaxMem; i++) {
			size[i] = 0;
		}
		int JuBing = 1;
		for (int i = 0; i < T; i++) {
			String oper = sc.next();
			switch (oper) {
			case "new":
				int newMem = sc.nextInt();
				MaxMem -= newMem;
				if (MaxMem < 0) {
					System.out.println("NULL");
					MaxMem += newMem;
					break;
				}
				hm.put(JuBing, newMem);
				System.out.println(JuBing++);
				break;
			case "del":
				int delIndex = sc.nextInt();
				Set<Integer> set = hm.keySet();
				for (Integer key : set) {
					Integer value = hm.get(key);
					if (delIndex == key) {
						if (value == 0) {
							System.out.println("ILLEGAL_OPERATION");
						} else {
							MaxMem += value;
						}
					}
				}
				break;
			case "def":

				break;
			}
		}
	}
}
