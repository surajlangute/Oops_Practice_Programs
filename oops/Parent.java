package demo.program.oops;
							//INHERITANCE SUPER CLASS //

public class Parent {
	
						// STATIC VARIABLE//
	static int amount = 1000;
	
						// NON STATIC METHOD //
	void property() {
		System.out.println("my 10acre land  ." );
	}

	
	public static void main(String[] args) {
		
				// OBJECT REQUIRED TO USE NONSTATIC INTO STATIC //
		Parent parent = new Parent();
		parent.property();
		System.out.println(amount + "crore");
		
	}

}