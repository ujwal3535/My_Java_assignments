
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make 2 arraysone will start from 21 contains all odd numbers till 37.
        int [] arreven= new int[19];
        int [] arrodd= new int[9];
        int j=0,k=0;
        for(int i=21;i<=37;i+=2) {
        	arrodd[j]=i;
        	j=j+1;	
        }
        for(int i=46;i<=82;i+=2) {
        	arreven[k]=i;
        	k=k+1;
        }
        System.out.println("===============21 to 37 all odd numbers=========");
        for(int i=0;i<9;i++) {
        	System.out.println(arrodd[i]);
        }
        System.out.println("===============46 to 82 all even numbers==========");
        for(int i=0;i<19;i++) {
        	System.out.println(arreven[i]);
        }
	}

}
