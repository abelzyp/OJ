package WrittenExam.XiaoMi.HaoMaFenShen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		if (T < 1 || T > 100)
			return;
		String[] strs = new String[T];
		for (int i = 0; i < T; i++) {
			strs[i] = sc.nextLine();
		}
		for (int i = 0; i < T; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			HashMap<Character, Integer> hm = getCount(strs[i]);
			if (hm.containsKey('Z')) {
				int num = hm.get('Z');
				for (int j = 0; j < num; j++) {
					list.add(0);
				}
				hm.remove("Z");
				hm.put('E', hm.get('E') - num);
				hm.put('R', hm.get('R') - num);
				hm.put('O', hm.get('O') - num);
			}
			Iterator<Character> it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('W')) {
				int num = hm.get('W');
				for (int j = 0; j < num; j++) {
					list.add(2);
				}
				hm.remove("W");
				hm.put('T', hm.get('T') - num);
				hm.put('O', hm.get('O') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('U')) {
				int num = hm.get('U');
				for (int j = 0; j < num; j++) {
					list.add(4);
				}
				hm.remove("U");
				hm.put('F', hm.get('F') - num);
				hm.put('O', hm.get('O') - num);
				hm.put('R', hm.get('R') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('X')) {
				int num = hm.get('X');
				for (int j = 0; j < num; j++) {
					list.add(6);
				}
				hm.remove("X");
				hm.put('S', hm.get('S') - num);
				hm.put('I', hm.get('I') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('G')) {
				int num = hm.get('G');
				for (int j = 0; j < num; j++) {
					list.add(8);
				}
				hm.remove("G");
				hm.put('E', hm.get('E') - num);
				hm.put('I', hm.get('I') - num);
				hm.put('H', hm.get('H') - num);
				hm.put('T', hm.get('T') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('O')) {
				int num = hm.get('O');
				for (int j = 0; j < num; j++) {
					list.add(1);
				}
				hm.remove("O");
				hm.put('N', hm.get('N') - num);
				hm.put('E', hm.get('E') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('T')) {
				int num = hm.get('T');
				for (int j = 0; j < num; j++) {
					list.add(3);
				}
				hm.remove("T");
				hm.put('H', hm.get('H') - num);
				hm.put('R', hm.get('R') - num);
				hm.put('E', hm.get('E') - num * 2);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('F')) {
				int num = hm.get('F');
				for (int j = 0; j < num; j++) {
					list.add(5);
				}
				hm.remove("F");
				hm.put('I', hm.get('I') - num);
				hm.put('V', hm.get('V') - num);
				hm.put('E', hm.get('E') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('V')) {
				int num = hm.get('V');
				for (int j = 0; j < num; j++) {
					list.add(7);
				}
				hm.remove("V");
				hm.put('S', hm.get('S') - num);
				hm.put('N', hm.get('N') - num);
				hm.put('E', hm.get('E') - num * 2);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			if (hm.containsKey('I')) {
				int num = hm.get('I');
				for (int j = 0; j < num; j++) {
					list.add(9);
				}
				hm.remove("I");
				hm.put('N', hm.get('N') - num * 2);
				hm.put('E', hm.get('E') - num);
			}
			it = hm.keySet().iterator();
			while (it.hasNext()) {
				if (hm.get(it.next()) == 0) {
					it.remove();
				}
			}

			ArrayList<Integer> ResList = new ArrayList<>();
			for (Integer ii : list) {
				ResList.add((ii + 2) % 10);
			}
			Collections.sort(ResList);
			for (Integer abel : ResList) {
				System.out.print(abel);
			}
			System.out.println();
		}
	}

	private static HashMap<Character, Integer> getCount(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		return hm;
	}
}
