package Function;

public class Swapping {
	int a;
	int b;
    
	Swapping(int p, int q){
		a=p;
		b=q;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping s1=new Swapping(10,20);
		System.out.println("Final Value of a="+s1.a+" and b="+s1.b );
	}
}
