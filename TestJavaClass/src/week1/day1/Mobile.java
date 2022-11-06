package week1.day1;

public class Mobile {
	
	public String globalvariable = "Hello Testt"; //We can use this in another class using public access specifier
	
	public void makeCall()
	{
		System.out.println("Call to 8098659843");
	}
	public void sendMsg()
	{
		System.out.println("Hello madam");
	}

	public static void main(String[] args)
	{ 
		Mobile objIphone = new Mobile();
		objIphone.makeCall();
		objIphone.sendMsg();
		System.out.println(objIphone.globalvariable); //Print the value from global variable using class object
		
	}
}
