package demo;
/**
 * 对象间的转型问题：
		向上转型：
			Fu f = new Zi();
		向下转型：
			Zi z = (Zi)f; //要求该f必须是能够转换为Zi的。
 * @author zhangzhang
 *
 */
class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}
class Zi extends Fu{
	public void show(){
		//super.show();
		System.out.println("show Zi");
	}
	public void method(){
		System.out.println("method Zi");
	}
}
public class DuotaiZhuanxing {

	public static void main(String[] args) {
		Fu f = new Zi();
		f.show();
		
		Zi z = (Zi) f;
		z.show();
		z.method();
	}

}
