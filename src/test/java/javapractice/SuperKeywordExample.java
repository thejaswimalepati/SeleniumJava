package javapractice;

class AnimalSample{
	
	String color="white";
}
class DogSample extends AnimalSample{
	String color="black";
	
	void printColor() {
		
		System.out.println(color);
		System.out.println(super.color);
	}
	
}





class SuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogSample obj=new DogSample();
           
           obj.printColor();
	}

}
