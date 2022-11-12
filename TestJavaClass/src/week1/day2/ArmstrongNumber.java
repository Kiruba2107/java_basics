package week1.day2;

public class ArmstrongNumber {
	

		

		/*
		 * Goal: To find whether a number is an Armstrong number or not
		 * 
		 * inputs: 153
		 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
		 */

		

		public static void main(String[] args) {

			int input =153;
			int original =input;
			int calculated = 0;
			
			while (input> 0)
			{
				int rem  = input % 10;
				calculated = calculated + rem*rem*rem;
				 input = input/10;
				
			}
			System.out.println(calculated);
			if (original ==calculated ) {
				System.out.println("The number is Armstrong");
			}else 
				System.out.println("The number is not an Armstrong");
			}

		

	}

