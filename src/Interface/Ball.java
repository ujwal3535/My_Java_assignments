package Interface;

public class Ball implements bouncable,movable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Ball can bounce");
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("Ball can move");
	}

}
