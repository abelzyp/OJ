package others;

/**
 * 方法重写：子类中出现了和父类中方法声明一模一样的方法。
 * 
 * @author zhangzhang 
 * 方法重写的应用： 当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法。
 *         这样，即沿袭了父类的功能，又定义了子类特有的内容。
 */
class IPhone{
	public void call(String name){
		System.out.println("给"+name+"打电话。");
	}
}

class NewiPhone extends IPhone{
	public void call(String name){
		super.call(name);
		System.out.println("打完电话还能听歌。");
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		NewiPhone np = new NewiPhone();
		np.call("张");
	}

}
