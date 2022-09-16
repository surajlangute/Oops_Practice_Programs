package demo.program.oops;

abstract class Bank {

	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 10;
	}
}

class YesBank {

	public static void main(String args[]) {
		Bank b = new PNB();
		// if object is SBI, method of SBI will be invoked
		int interest = b.getRateOfInterest();
		System.out.println("Rate of Interest is: " + interest + " %");
	}

}
