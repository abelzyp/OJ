package others;

class Animal{
	private String name;
	private int age;
	private String color;
	
	public Animal(){}
	public Animal(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
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
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public void eat(String name){
		System.out.println(this.name+"要吃饭。");
	}
}
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age,String color){
		super(name,age,color);
	}
	public void playGame(){
		System.out.println("game");
	}
}
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age,String color){
		super(name,age,color);
	}
	public void lookDoor(){
		System.out.println("lookDoor");
	}
}
public class CatDog {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("Cat");
		c.setAge(1);
		c.setColor("red");
		System.out.println(c.getName()+"今年"+c.getAge()+"岁，它是"+c.getColor()+"色的。");
		c.eat(c.getName());
		c.playGame();
		System.out.println("----------");
		Cat cc = new Cat("Catcat",2,"green");
		System.out.println(cc.getName()+"今年"+cc.getAge()+"岁，它是"+cc.getColor()+"色的。");
		System.out.println("----------");
	}

}
