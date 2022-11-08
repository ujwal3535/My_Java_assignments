
public class Foreacharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int [] arr1= {10,20,30,40,50,60,70,80,90,100};
//        int [] arr2= {5,10,15,20,25,30,35,40,45,50};
		int [] arr1= new int[10];
        int [] arr2= new int[10];
        int y=0,k=0;
        for(int i=0;i<10;i+=1)
        {
        	y=y+10;
        	arr1[i]=y;
        }
        for(int i=0;i<10;i+=1)
        {
        	k=k+5;
        	arr2[i]=k;
        }
        for(int x : arr1) {
        	System.out.println("Array1 numbers are:"+x);
        }
        System.out.println();
        for(int x : arr2) {
        	System.out.println("Array2 numbers are:"+x);
        } 
	}

}
