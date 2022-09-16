package demo.program.oops;

public class ChildMR extends ParentMR {
				//OVERRIDING METHOD : CHANGING LOGIC OF PARENT //
	void show()
	{
	System.out.println("Showing in child.....");
	
	//USING SUPER KEYWORD TO ACCESS PARENT CLASS METHOD/VARIABLES//
	super.show();
	}
	
	public static void main(String[] args) {
 
				// CREATING CHILD OBJECT FOR METHOD CALLING //
		ChildMR child = new ChildMR();
		child.show();
		
				// CREATING PARENT OBJECT TO ACCESS PARENTS METHOD// 
		ParentMR parent =new ParentMR();
		parent.show();
		
	}

}
