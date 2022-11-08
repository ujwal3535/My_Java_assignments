package ClassesandObjects;
import Function.Fibonacci;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehical v1=new Vehical();
        v1.brand="Ford";
        v1.Fueltype="Petrol";
        v1.accelrate();
        v1.deccelrate();
        v1.turning();
        Fibonacci fi= new Fibonacci();
        fi.fibonacci(0);
        v1.brand="BMW";   
	}
}