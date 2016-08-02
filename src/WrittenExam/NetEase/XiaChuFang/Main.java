package WrittenExam.NetEase.XiaChuFang;

/*
 * 输出多行字符中单词的个数
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = new String[50];
		Set<String> set = new HashSet<String>();
		while (sc.hasNextLine()) {
			strs = sc.nextLine().split(" ");
			for (int i = 0; i < strs.length; i++) {
				set.add(strs[i]);
			}
		}
		System.out.println(set.size());
	}
}
