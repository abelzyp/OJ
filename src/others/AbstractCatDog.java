package others;
/**
 * 	猫狗案例
		具体事物：猫，狗
		共性：姓名，年龄，吃饭

	分析：从具体到抽象
		猫:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭(猫吃鱼)
			
		狗:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭(狗吃肉)
			
		因为有共性的内容，所以就提取了一个父类。动物。
		但是又由于吃饭的内容不一样，所以吃饭的方法是抽象的，
		而方法是抽象的类，类就必须定义为抽象类。
		
		抽象动物类：
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();
	
	实现：从抽象到具体
		动物类:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();
			
		狗类：
			继承自动物类
			重写吃饭();
			
		猫类：
			继承自动物类
			重写吃饭();
 * @author zhangzhang
 *
 */
abstract class Animail{
	private String name;
	private int age;
	
	public Animail(){}
	public Animail(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public abstract void eat();
}
class Catt extends Animail{
	public Catt(){}
	public Catt(String name,int age){
		super(name, age);
	}
	public void eat(){
		System.out.println("猫吃鱼。");
	}
}
class Dogg extends Animail{
	public Dogg(){}
	public Dogg(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("狗吃肉。");
	}
}
public class AbstractCatDog {

	public static void main(String[] args) {
		Catt c = new Catt();
		c.setName("tom");
		c.setAge(2);
		System.out.println(c.getName()+"---"+c.getAge());
		c.eat();
		System.out.println("----------");
		Catt c2 = new Catt("tomm",3);
		System.out.println(c2.getName()+"---"+c2.getAge());
		c2.eat();
		System.out.println("--------------------");
		Animail a = new Catt();
		a.setName("jay");
		a.setAge(4);
		System.out.println(a.getName()+"-"+a.getAge());
		a.eat();
		System.out.println("----------");
		Animail a2 = new Catt("jayy",5);
		System.out.println(a2.getName()+"-"+a2.getAge());
		a2.eat();
	}

}
