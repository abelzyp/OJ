package others;
/**
老师和学生案例,加入抽烟的额外功能

分析：从具体到抽象
	老师：姓名，年龄，吃饭，睡觉
	学生：姓名，年龄，吃饭，睡觉
	
	由于有共性功能，我们提取出一个父类，人类。
	
	人类：
		姓名，年龄
		吃饭();
		睡觉(){}
		
	抽烟的额外功能不是人或者老师，或者学生一开始就应该具备的，所以，我们把它定义为接口
	
	抽烟接口。

	部分老师抽烟：实现抽烟接口
	部分学生抽烟：实现抽烟接口
*/
interface Smoking{
	public abstract void smoke();
}
abstract class Human{
	private String name;
	private int age;
	public Human(){}
	public Human(String name,int age){
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
	public void sleep(){
		System.out.println("是人都睡觉");
	}
}
class Teacherer extends Human{
	public Teacherer(){}
	public Teacherer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("老师吃素");
	}
}
class Studentnt extends Human{
	public Studentnt(){}
	public Studentnt(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("学生吃肉");
	}
}
class SmokeTea extends Teacherer implements Smoking{
	public SmokeTea(){}
	public SmokeTea(String name,int age){
		super(name,age);
	}
	public void smoke(){
		System.out.println("有的老师抽烟");
	}
}
class SmokeStu extends Studentnt implements Smoking{
	public SmokeStu(){}
	public SmokeStu(String name,int age){
		super(name,age);
	}
	public void smoke(){
		System.out.println("有的学生抽烟");
	}
}
public class InterfaceTeaStu {

	public static void main(String[] args) {
		
	}

}
