package oops;

class person {
	String name;
	int age;
	
	static int count;
	public person () {
		this("Palak", 14);
		count++;
		System.out.println(count + " " + this.name + " has created");
	}
	public person (String name, int age) {
//		this();                //calling constructor
		this.name = name;	   //point to current object
		this.age = age;
		walking(this);
	}
	void walking (person obj) {
		System.out.println(name + " is walking");
		running();
	}
	static void running () {
		System.out.println("Running");
	}

}

public class staticKeyword {

	public static void main(String[] args) {
		
		person p1 = new person();
//		person p2 = new person();
//		person p3 = new person("Bhoomika", 22);
		
//		System.out.println(person.count);
		System.out.println(p1.name + " " + p1.age);
//		p1.walking();

	}

}
