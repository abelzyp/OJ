package BeautifulCode;

import java.util.Arrays;

/*
 * 你听过lambda表达式么？
 * 对的，就是那个，很新，JDK8
 */
public class Code2 {
	public static void main(String[] args) {
		String[] friends = { "Abel", "Ricky", "Andy", "Pale", "Victor", "Atom" };
		Arrays.sort(friends, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(friends));
	}
}
