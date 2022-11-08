
public class mediumlvlproblem {
    public static void main(String args[]) {
    	
    	int [] arr=new int[50];
    	for(int i=0;i<arr.length;i+=1)
    	{
//    		System.out.println(i+(i+2));
    		arr[i]=i+(i+2);
    	}
    	for(int x:arr) {
    		System.out.println(x);
    	}
    	for(int x:arr) {
    		System.out.println(x-1);
    	}
    	
    }
}
