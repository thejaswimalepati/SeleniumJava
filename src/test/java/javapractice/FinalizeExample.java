package javapractice;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeExample obj=new FinalizeExample();
		System.out.println("Hashcode is: "+obj.hashCode());
		
		obj=null;
		
		//System.gc();
		System.out.println("End of garbage collection");
	}
		protected void finalize() {
			
			System.out.println("finalize method is called");
		}

	

}
