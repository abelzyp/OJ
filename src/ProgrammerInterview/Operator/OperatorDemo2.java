package ProgrammerInterview.Operator;

/*
 * 本例测试">>"运算符
 * 解析：
 * 		移位操作符右边的参数要先进行模32运算，并且移位是对二进制的操作，
 * 		而二进制中8位是一个循环。所以，num>>32等于num>>0,
 * 		而num>>33等于num>>1。
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		int num = 32;
		System.out.println(num >> 32);
	}
}
