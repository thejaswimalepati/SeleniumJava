package javapractice;

public class ImplementedClass implements Sample1 {

	public void methodAdd() {
		System.out.println("Add");
	}

	public void methodSub() {
		System.out.println("Sub");
		
	}
	
	public static void main(String[] args) {
		ImplementedClass obj=new ImplementedClass();
		
		obj.methodAdd();
		obj.methodSub();
	}

}
