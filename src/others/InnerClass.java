package others;

interface Inner{
	void show();
}

class Outer{
	//补齐代码
	public static Inner method(){
		return new Inner(){
			public void show(){
				System.out.println("test");
			}
		};
	}
}

class InnerClass{
	public static void main(String[] args){
		Outer.method().show();
	}
}