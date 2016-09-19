package WrittenExam.LeEco.TiaoYueDeMaZha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 * 此题有问题
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n < -1000000000 || n > 1000000000)
				continue;

			if (n == 0) {
				System.out.println(0);
				continue;
			}

			int dest = 0;
			int stepLen = 1;
			int stepNum = 0;
			Queue<Integer> queue = new LinkedList<>();
			List<Integer> list = new ArrayList<>();
			queue.add(dest);
			while (queue.peek() <= n || queue.peek() >= -n) {
				queue.add(queue.peek() + stepLen);
				queue.add(queue.peek() - stepLen);
				stepLen++;
				stepNum++;
				list.add(stepNum);
			}
			Collections.sort(list);
			System.out.println(list.get(0));
		}
	}
}