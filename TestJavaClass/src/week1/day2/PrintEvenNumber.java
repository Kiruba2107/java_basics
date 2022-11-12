package week1.day2;

public class PrintEvenNumber {
	public static void main(String[] args)
	{
		int i ;
		for (i = 1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("EvenNumbers are: "+ i);
			}
			else
			{
				System.out.println("OddNumbers are: "+ i);
			}
		}
		
	}

}
