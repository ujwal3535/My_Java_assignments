
public class Day2Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // WAP to print 2's table with for loop
		int i,j;
		for(j=1;j<=10;j+=1) {
			for(i=1;i<=10;i+=1) {
				int n=i*j;
				System.out.println(j+" X "+i+" = "+n);
			}
			System.out.println();
		}	
	}
}
