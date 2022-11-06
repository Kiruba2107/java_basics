package week1.day2;

import java.util.Scanner;

public class MainCalculator {
	
	public static void main(String[] args)
	{
		TestCalculator objCalculator = new TestCalculator();
		Scanner in = new Scanner(System.in);  
		System.out.print("num1:"); 
		int num1 = in.nextInt();
		System.out.print("num2:"); 
		int num2 = in.nextInt();
		System.out.print("num3:");
		int num3 = in.nextInt();
		System.out.print("float1: ");
		float float1 = in.nextFloat();
		System.out.print("float2: ");
		float float2 = in.nextFloat();
		int addition = objCalculator.sum(num1, num2, num3);
		int subtractResult =objCalculator.sub(num1, num2);
		double multipleResult= objCalculator.multiple(90.24, 688.23);
		float divideresult = objCalculator.divide(float1, float2);
		
		System.out.println("AdditionResult: "+addition);
		System.out.println("Sub: "+subtractResult);
		System.out.println("Multiple: "+multipleResult);
		System.out.println("Divide: "+divideresult);

}
}