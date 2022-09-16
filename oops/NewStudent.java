package demo.program.oops;

								// CONSTRUCTOR PROBLEMS //
								//OVERLOADED CONSTRUCTOR//
						//Java program to overload constructors//

public class NewStudent {
	int id;
	String name;
	int age;

						// creating two arg constructor//
	NewStudent(int i, String n) {
		id = i;
		name = n;
	}

						// creating three arg constructor//
	NewStudent(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
					// nonstatic method //
	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		
					//created diff objects for diff data//
		NewStudent s1 = new NewStudent(111, "SURYAA");
		NewStudent s2 = new NewStudent(222, "PUSHPARAJ", 25);
		NewStudent s3 = new NewStudent(333,"ROCKY" ,35);
		s1.display();
		s2.display();
		s3.display();
	}
}
