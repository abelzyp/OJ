package ProgrammerInterview.iplusplus;

/*
 * Java用了中间缓存变量的机制
 */
public class IppDemo2 {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;// 问题就出在这里：与j++不同
		}
		System.out.println(j);
	}
}
