package InterfaceHomework16;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RemoteDevice r1=new Tv();
        r1.switchoff();
        r1.switchon();
        RemoteDevice r2=new Dvd();
		r2.switchoff();
		r2.switchon();
		
	}

}
