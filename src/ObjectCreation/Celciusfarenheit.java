package ObjectCreation;
import java.util.*;
public class Celciusfarenheit {
	
	float convertor(float c) {
		float farienheit;
		farienheit=(c * 9/5) + 32; 
		return farienheit;
		
	}
	
    public static void main(String[] args) {
    	Scanner st=new Scanner(System.in);
    	System.out.println("Enter temprature in Celcius:");
    	float c=st.nextFloat();
    	Celciusfarenheit c1=new Celciusfarenheit();
    	System.out.println("Temprature in Farienheit:"+c1.convertor(c));
    	
    	
    }
}
