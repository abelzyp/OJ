package WrittenExam.QiHu360.ZuiQiangDaNao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s1 = sc.nextLine();
			String s2 = swap(s1.toCharArray(), 0, s1.length() - 1);
			String a1 = sc.nextLine();
			String a2 = sc.nextLine();
			boolean flag1 = sub(s1, a1, a2);
			boolean flag2 = sub(s2, a1, a2);
			if (flag1 && flag2) {
				System.out.println("both");
			} else if (flag1) {
				System.out.println("forward");
			} else if (flag2)
				System.out.println("backward");
			else
				System.out.println("invalid");
		}
	}

	public static String swap(char[] a, int begin, int end) {
		while (begin < end) {
			char temp = a[begin];
			a[begin] = a[end];
			a[end] = temp;
			begin++;
			end--;
		}
		return new String(a);
	}

	public static boolean sub(String s, String s1, String s2) {
		int i = get(s, s1);
		int j = -1;
		if (i != -1) {
			String ss = s.substring(i + s1.length());
			j = get(ss, s2);
			if (j != -1)
				return true;
		}
		return false;
	}

	public static int get(String s, String m) {

		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1;
		}
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();
		int psi = 0;
		int pmi = 0;
		int[] next = getNextArray(ms);
		while (psi < ss.length && pmi < ms.length) {
			if (ss[psi] == ms[pmi]) {
				// 如果当前字符相等，则指针都往后挪
				psi++;
				pmi++;
			} else if (next[pmi] == -1) {
				psi++;
			} else {
				pmi = next[pmi]; // 如果当前字符的前后缀相等字符串长度为-1，则子串的指针变为next[mi];
			}
		}
		return pmi == ms.length ? psi - pmi : -1;
	}

	public static int[] getNextArray(char[] ms) {
		if (ms.length == 1) {
			return new int[] { -1 };
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int right = 2; // 从下标2开始计算，相当于后面的指针，即当前遍历的指针
		int left = 0;
		while (right < next.length) {
			if (ms[right - 1] == ms[left]) {
				next[right++] = ++left; // 如果相等当前指针的前一个字符和left指针所指向的数相等，则next[right]为left
			} else if (left > 0) {
				left = next[left];
			} else {
				next[right++] = 0; // 如果left是0，则right只能是0
			}
		}
		return next;
	}
}