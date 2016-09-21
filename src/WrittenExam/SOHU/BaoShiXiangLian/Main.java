package WrittenExam.SOHU.BaoShiXiangLian;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(minLength(in.next()));
		}
	}

	public static int minLength(String t) {
		String targetLoop = t + t;
		String cutTarget = "ABCDE";
		if (cutTarget.length() > targetLoop.length())
			return 0;

		HashMap<Character, Integer> target = new HashMap<Character, Integer>();
		String cutResult = "";
		for (int i = 0; i < cutTarget.length(); i++) {
			char c = cutTarget.charAt(i);
			if (target.containsKey(c)) {
				target.put(c, target.get(c) + 1);
			} else {
				target.put(c, 1);
			}
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int l = 0;
		int minLength = targetLoop.length() + 1;
		int count = 0;

		for (int i = 0; i < targetLoop.length(); i++) {
			char c = targetLoop.charAt(i);

			if (target.containsKey(c)) {
				if (map.containsKey(c)) {
					if (map.get(c) < target.get(c)) {
						count++;
					}
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
					count++;
				}
			}

			if (count == cutTarget.length()) {
				char sc = targetLoop.charAt(l);
				while (!map.containsKey(sc) || map.get(sc) > target.get(sc)) {
					if (map.containsKey(sc) && map.get(sc) > target.get(sc))
						map.put(sc, map.get(sc) - 1);
					l++;
					sc = targetLoop.charAt(l);
				}

				if (i - l + 1 < minLength) {
					cutResult = targetLoop.substring(l, i + 1);
					minLength = i - l + 1;
				}
			}
		}

		return t.length() - cutResult.length();
	}
}
