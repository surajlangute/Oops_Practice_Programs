package demo.program.oops;

public class PolymorphismMO {
							//POLYMORPHISM//
						//METHOD OVERLOADING //
		int num1;
		int num2;  				// DEFAULT VALUE -0
		double num3;			//DEFAULT VALUE -0.0
		float num4; 			//DEFAULT VALUE -0.0
		
					//PARAMETRISED CONSTRUCTOR//
		PolymorphismMO(int num1, double num3)
		{
			this.num1 =  num1 ;
			this.num3 =  num3;
		}
		
					//ZERO ARG CONSTRUCTOR //
		PolymorphismMO()
		{
			
		}
		
					// OVERLOADED WITH INT INT PARAMETERS //
		PolymorphismMO(int num1, int num2)
		{
			this.num1 = num1;
			this.num2 = num2;
		}
		
						// OVERLOADED WITH 4 PARAMETERS //
		PolymorphismMO(int num1, int num2, double num3, float num4)
		{
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
			this.num4 = num4;
			
		}

		void add(double num1, int num2) {
			System.out.println(num1 + num2);
		}

		void add(double num1, double num2) {
			System.out.println(num1 + num2);
		}

		void add(int num1, int num2) {
			System.out.println(num1 + num2);
		}

		void add(int num1, int num2, int num3) {
			System.out.println(num1 + num2 + num3);
		}

		public static void main(String args[]) {
			PolymorphismMO calci = new PolymorphismMO();
			calci.add(1, 2, 3);
			
			calci.add(12.56, 12);

			}
}




					/*	new => keyword
  						Constructor => Initialze / assign values
     					=> Default/zero-arg == >Default values
       					0, 0.0,null,false
						=> Paramtherized==> User pass
					 								*/