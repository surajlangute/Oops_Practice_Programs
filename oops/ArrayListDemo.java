package demo.program.oops;

import java.util.ArrayList;
								//ARRAY LIST PROBLEM //
					//INITIAL SIZE 10 : ONCE FULL NEW SIZE = OLD SIZE(10)*3/2 //
public class ArrayListDemo {

	public static void main(String[] args) {
					
								//CREATING ARRAYLIST //
		
		ArrayList colors = new ArrayList();
		
								//ASSIGNING VALUES TO ARRAYLIST//
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("black");
						
								//PRINTING COMPLETE ARRAYLIST//
		System.out.println(colors);
			
								//PRINTING SPECIFIC INDEX VALUES//
		System.out.println(colors.get(3));
		
								// REMOVING SPECIFIC INDEXES// 
		colors.remove(3);
		System.out.println(colors);

								// PRINTING TOTAL SIZE OF AN ARRAYLIST//
System.out.println("size :" + colors.size());

	}

}
