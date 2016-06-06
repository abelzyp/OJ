package others;
/**
猫狗案例,加入跳高的额外功能

分析：从具体到抽象
	猫：
		姓名,年龄
		吃饭，睡觉
	狗：
		姓名,年龄
		吃饭，睡觉
		
	由于有共性功能，所以，我们抽取出一个父类：
	动物：
		姓名,年龄
		吃饭();
		睡觉(){}
		
	猫：继承自动物
	狗：继承自动物
	
	跳高的额外功能是一个新的扩展功能，所以我们要定义一个接口
	接口：
		跳高
		
	部分猫：实现跳高
	部分狗：实现跳高
实现；
	从抽象到具体
	
使用：
	使用具体类
*/

interface Jump{
	public abstract void jump();
}
abstract class AnimalClass{
	private String name;
	private int age;
	
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
	
	public AnimalClass(){}
	public AnimalClass(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public abstract void eat();
	public void sleep(){
		System.out.println("每个动物都要睡觉。");
	}
}
class Catcat extends AnimalClass{
	public Catcat(){}
	public Catcat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
class Dogdog extends AnimalClass{
	public Dogdog(){}
	public Dogdog(String name,int age)	{
		super(name,age);
	}
	public void eat(){
		System.out.println("狗吃肉");
	}
}
class JumpCat extends Catcat implements Jump{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("有的猫会跳高");
	}
}
class JumpDog extends Dogdog implements Jump{
	public JumpDog(){}
	public JumpDog(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("有的狗会跳高");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		JumpCat jc = new JumpCat();
		jc.setName("tom");
		jc.setAge(2);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		System.out.println("----------");
		Catcat cc = new Catcat();
		cc.setName("jarry");
		cc.setAge(3);
		System.out.println(cc.getName()+"---"+cc.getAge());
		cc.eat();
		cc.sleep();
		System.out.println("----------");
		Catcat jcc = new JumpCat();
		jcc.setName("kitty");
		jcc.setAge(4);
		System.out.println(jcc.getName()+"---"+jcc.getAge());
		jcc.eat();
		jcc.sleep();
		//jcc.jump();然而Catcat类中并没有定义jump函数
		JumpCat jccc = (JumpCat) jcc;
		jccc.setName("lily");
		jccc.setAge(5);
		System.out.println(jccc.getName()+"---"+jccc.getAge());
		jccc.eat();
		jccc.sleep();
		jccc.jump();
	}

}
