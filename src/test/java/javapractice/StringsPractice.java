package javapractice;

public class StringsPractice {
	//String
	public static void concat1(String s1) {
		s1=s1+"abc";
	}
	//String builder
	public static void concat2(StringBuilder s2) {
		s2=s2.append("ert");
	}
	//String buffer
	public static void concat3(StringBuffer s3) {
		s3=s3.append("oiu");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123";
		
		concat1(s1);
		System.out.println("String S1 after adding : "+s1);
		
		StringBuilder s2=new StringBuilder("jhkj");
		
		concat2(s2);
		
		System.out.println("String S2 after adding : "+s2);
		
		StringBuffer s3=new StringBuffer("qw");
		concat3(s3);
		System.out.println("String S3 after adding : "+s3);		
		
		

	}

}
