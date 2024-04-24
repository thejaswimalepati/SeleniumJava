package javapractice;

class Sample{

static int multiply(int a,int b){
  
return a*b;
}

static double multiply(double c, double d){
	return c*d;

}

}

 class MethodIverloading {

	public static void main(String[] args) {
		
		System.out.println(Sample.multiply(2, 3));
		System.out.println(Sample.multiply(2.5, 5.6));

	}

}
