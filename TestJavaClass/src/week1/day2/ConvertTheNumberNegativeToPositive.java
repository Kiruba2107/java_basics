package week1.day2;

public class ConvertTheNumberNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -35;
		int count = -1;
		if(number < 0) {
			System.out.println("Number is Negative:"+number);
			count= count* number;
		}
		System.out.println("Coverted number to postive:"+count);
	}

}
