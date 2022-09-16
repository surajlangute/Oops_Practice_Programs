package demo.program.oops;

public class ParentMR {
	
				// METHOD OVERRIDING : CHANGING LOGIC PROBLEM//
				// CREATED SUPER CLASS PARENTMR //
	
	
	//NON STATIC PARENT METHOD CREATED  //
	void show()
	{
		System.out.println("Showing in Parent.....");
	}
	
	public static void main(String[] args) {
		
		// OBJECT CREATED FOR CALLING NONSTATIC METHOD //
		ParentMR parent = new ParentMR();
		parent.show();
	}
	
}
	
	
			
