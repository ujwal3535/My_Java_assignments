package ObjectCreation;

public class ArrayDemo {
    
	
	static void display(int...arr) {
		System.out.println();
		System.out.println("Number of argumnets :"+arr.length);
		System.out.println();
		for(int x: arr) {
			System.out.println("Values in varargs:"+x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6,7,8,9,10};
       for(int i=0;i<10;i++) {
    	   System.out.println("When index is "+i+" value is "+arr[i]);
       }
       float [] arr2={2.3f,5.6f,3.7f,9.8f,98.0f};
       for(float x:arr2){
    	   System.out.println("Value is "+x);
       }
       display(2,6,3,7,4,9);
       display(arr);
       
	}

}
