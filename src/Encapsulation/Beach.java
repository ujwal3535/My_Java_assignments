package Encapsulation;

public class Beach {
    private static String name; 
	private static int people;
	private static int length;
	
	Beach(String name, int people, int length){
		this.setName(name);
		this.setPeople(people);
		this.setLength(length);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Beach.name = name;
	}

	public static int getPeople() {
		return people;
	}

	public static void setPeople(int people) {
		Beach.people = people;
	}

	public static int getLength() {
		return length;
	}

	public static void setLength(int length) {
		Beach.length = length;
	}
	
}
