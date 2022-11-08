package Lab_Exercise;

public class MathClass {
	
	
	void varargs(float...arr) {
		float sum=0;
		for(float x:arr) {
			sum=sum+x;
		}
		System.out.println("Addition through VarArgs:"+sum);
		
	}
	
	int add(int a, int b){
		return a+b;	
	}
	float add(float a, float b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lab exercise 3
		MathClass m1=new MathClass();
		System.out.println("Addition of integers:"+m1.add(1, 2));
		System.out.println("Addition of Float:"+m1.add(1.3f, 2.4f));
		System.out.println("Concatination of two Strings:"+m1.add("Welcome to", " Java"));
        //Lab Exercise 4
		m1.varargs(1,2,2,3,4,5,6);
	}

}
