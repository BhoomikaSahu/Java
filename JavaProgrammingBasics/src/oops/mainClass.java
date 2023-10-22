package oops;

public class mainClass {

	public static void main(String[] args) {
		animal a1 = new animal();
		a1.legs = 4;
		a1.name = "Cow";
		animal a2 = new animal("Lion");
		
		System.out.println(a1.legs + " " + a1.name);
		a1.walk();
		a1.walk(7);
	}

}

class animal {
	int legs;
	String name;
	
	public animal () {
		System.out.println("I am default constructor");
	}
	public animal (String name) {
		System.out.println("I am parameterize constructor " + name);
	}
	
	void walk () {
		System.out.println("I am walking ");
	}
	void walk (int steps) {
		System.out.println("I walked " + steps + " steps.");
	}
}
