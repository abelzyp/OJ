package demo;

import java.util.Scanner;

/**
 * 定义一个长方形类,定义 求周长和面积的方法， 然后定义一个测试了Test2，进行测试。
 * 
 * 长方形的类： 
 * 成员变量： 
 * 		长，宽 
 * 	成员方法： 
 * 		求周长：(长+宽)*2; 
 * 		求面积：长*宽
 * @author zhangzhang
 * 
 */
public class Changfangxing {

	public static void main(String[] args) {
		Rectangle rtg = new Rectangle();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		rtg.setLength(length);
		rtg.setWidth(width);
		System.out.println(rtg.zhouchang());
		System.out.println(rtg.area());
	}
}

class Rectangle{
	private int length;
	private int width;
	
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	
	public int zhouchang(){
		return (length+width)*2;
	}
	public int area(){
		return length*width;
	}
}