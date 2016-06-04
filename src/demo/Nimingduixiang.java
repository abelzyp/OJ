package demo;
/**
 * 匿名对象可以作为实际参数传递
 * @author zhangzhang
 *
 */
public class Nimingduixiang {

	public static void main(String[] args) {
		Student student = new Student();
		student.show();
		
		StudentDemo sd = new StudentDemo();
		sd.method(new Student());
		
		new StudentDemo().method(new Student());
	}
}

class Student{
	public void show(){
		System.out.println("i love study.");
	}
}

class StudentDemo{
	public void method(Student s){
		s.show();
	}
}