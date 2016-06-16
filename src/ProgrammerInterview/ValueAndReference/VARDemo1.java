package ProgrammerInterview.ValueAndReference;

/*
 * 本例考察值传递和引用传递
 * 注意：
 * 		不管Java参数的类型是什么，一律传递参数的副本。
 * 		如果是传值，那么传递的是值的副本；如果是传引用，那么传递的是引用的副本。
 */
class Value {
	public int i = 15;
}

public class VARDemo1 {
	public static void main(String[] args) {
		VARDemo1 var = new VARDemo1();
		var.first();
	}

	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i + " " + i);
	}

	public void second(Value v, int i) {
		i = 0;
		v.i = 20;// 通过引用的副本改变原对象的值为20
		Value val = new Value();// new出一个新的对象
		v = val;// 引用的副本指向了一个新的Object
		// 这里关键就是这句话，这句话之前，v这个副本指向的是first()函数中new出来的对象
		// 这句话执行完，v这个副本指向的就是在本函数中new出来的对象了
		// 所以first函数中打印出的v.i的值才为20
		System.out.println(v.i + " " + i);// 打印新对象的值
	}
}
