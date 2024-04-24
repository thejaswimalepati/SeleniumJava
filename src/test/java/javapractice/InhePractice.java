package javapractice;

class Animal{
	
	void eat() {
		System.out.println("eating....");
	}
} 

class Dog extends Animal{
	
	void bark() {
		System.out.println("Barking....");
	}
	
}

class BabyDog extends Dog{
	
	void weep() {
		System.out.println("weeping....");
	}
}

public class InhePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BabyDog obj=new BabyDog();
     
     obj.eat();
     obj.bark();
     obj.weep();
	}

}
