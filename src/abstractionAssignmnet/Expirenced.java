package abstractionAssignmnet;

public class Expirenced extends SrDeveloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expirenced exp=new Expirenced();
		exp.work();
		exp.teach();
		exp.coding();
		System.out.println("Employee no:"+emp_id);

	}
	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println("Overideen Employee abstract method");
	}
	@Override
	void coding() {
		// TODO Auto-generated method stub
		System.out.println("Overideen Developer abstract method");
	}
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("Overideen Sr.Developer abstract method");
	}

}
