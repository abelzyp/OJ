package ProgrammerInterview.Operator;

/*
 * 本例测试"?:"运算符
 * 解析：
 * 		int i = 10;中的i是一个变量，因此，第一个输出x被提升为int型了
 * 		对于第二个输出，Java编程规范中提到：当后两个表达式有一个是常量表达式时，
 * 		另外一个类型是T(本题中是char)时，而常量表达式可以被T表示时，输出结果是T类型
 */
public class OperatorDemo1 {
	public static void main(String[] args) {
		char x = 'x';
		int i = 10;
		System.out.println(false ? i : x);
		System.out.println(false ? 10 : x);
	}
}
