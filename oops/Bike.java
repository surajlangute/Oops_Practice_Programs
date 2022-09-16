package demo.program.oops;

abstract public class Bike {

	abstract void run();
}

class Honda extends Bike {
	void run() {
		System.out.println("Bike is " +"running safely..");
	}

	public static void main(String args[]) {
		Bike out = new Honda();
		out.run();
	}
}
