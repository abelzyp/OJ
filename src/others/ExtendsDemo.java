package others;
/**
 * 继承时候需要注意子类的构造函数
 * @author zhangzhang
 *
 */
class Person{
	private String name;
	private int age;
	
	public Person(){
		
	}
	public Person(String name,int age){
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
}

class Teacher extends Person{

	public Teacher(String name, int age) {
		super(name, age);
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
}

class Professor extends Person{
	public Professor(){
		
	}
	public Professor(String name,int age){
		super(name,age);
	}
}

public class ExtendsDemo {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("zhangSan");
		t.setAge(27);
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println("----------");
		Teacher tt = new Teacher("zhangZhang",27);
		System.out.println(tt.getName()+"---"+tt.getAge());
		System.out.println("----------");
		
		Professor p = new Professor();
		p.setName("liSi");
		p.setAge(37);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println("----------");
		Professor pp = new Professor();
		pp.setName("liLi");
		pp.setAge(37);
		System.out.println(pp.getName()+"---"+pp.getAge());
	}

}
