package WrittenExam.Qunar.AutoPilot01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<ABEL> q;
	static int[][] visit;
	static int n;
	static int[][] map;
	static int[][] ori = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while (sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		n = (int) Math.sqrt(list.size());
		map = new int[n][n];
		visit = new int[n][n];
		q = new LinkedList<>();
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = list.get(index++);
			}
		}
		if (map[0][0] == 1 || map[n - 1][n - 1] == 1) {
			System.out.println(-1);
		}
		System.out.println(bfs());

	}

	static int bfs() {
		ABEL pre = new ABEL(0, 0, 0);
		ABEL next = null;
		q.add(pre);
		while (!q.isEmpty()) {
			pre = q.poll();
			visit[pre.x][pre.y] = 1;
			for (int i = 0; i < 4; i++) {
				int x = pre.x + ori[i][0];
				int y = pre.y + ori[i][1];
				if (x == n - 1 && y == n - 1) {
					return pre.time + 1;
				}
				if (x >= 0 && x < n && y >= 0 && y < n && map[x][y] == 0 && visit[x][y] == 0) {
					next = new ABEL(x, y, pre.time + 1);
					q.add(next);
				}
			}
		}
		return -1;
	}
}

class ABEL {
	int x, y, time;

	public ABEL(int x, int y, int time) {
		this.x = x;
		this.y = y;
		this.time = time;
	}
}
