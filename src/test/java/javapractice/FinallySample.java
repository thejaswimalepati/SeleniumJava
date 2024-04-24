package javapractice;

public class FinallySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int data=25/0;
			System.out.println(data);
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException is handeled");
		}finally {
			System.out.println("finally block is always executed");
		}

	}

}
