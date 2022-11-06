package week1.day2;

public class MainCalculator {
	
	public static void main(String[] args)
	{
		TestCalculator objCalculator = new TestCalculator();
		int addition = objCalculator.sum(12, 33, 566);
		int subtractResult =objCalculator.sub(20, 10);
		double multipleResult= objCalculator.multiple(90, 688);
		float divideresult = objCalculator.divide(78, 12);
		
		System.out.println("AdditionResult: "+addition);
		System.out.println("Sub: "+subtractResult);
		System.out.println("Multiple: "+multipleResult);
		System.out.println("Divide: "+divideresult);

}
}