package ProgrammerInterview.OO;

import java.util.ArrayList;
import java.util.List;

/*
 * 此题考查面向对象的知识
 * 		第一个输出是false是因为list.add(oo1);在list中放的是oo1,也就是说"object"的内存地址，而不是"object"本身。
 * 		第二个输出是true
 * 		第三个是false,是因为调用了Object类的equals()方法
 */
public class OODemo1 {
	private String value = null;

	public OODemo1(String value) {
		this.value = value;
	}

	public boolean equals(OODemo1 o) {
		if (o == this) {
			return true;
		}
		if (o instanceof OODemo1) {
			OODemo1 oo = o;
			return value.equals(oo.value);
		}
		return false;
	}

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		OODemo1 oo1 = new OODemo1("object");
		OODemo1 oo2 = new OODemo1("object");
		OODemo1 oo3 = new OODemo1("object");
		Object oo4 = new OODemo1("object");
		list.add(oo1);
		System.out.println(list.contains(oo2));
		System.out.println(oo2.equals(oo3));
		System.out.println(oo3.equals(oo4));
	}
}
