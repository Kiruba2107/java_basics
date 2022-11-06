package week1.day1;

public class PrimitiveDatatypes {
	
	public int noOfWheels=2;
	public short noOfmirrors=3;
	public long chassisnumber=656780876;
	public boolean isPunctured=true;
	public String bikeName="Yamaha Alpha";
	public double runningKM=1123.345;
	
	public static void main(String[] args)
	{
		PrimitiveDatatypes objDataType = new PrimitiveDatatypes();
		System.out.println(objDataType.noOfWheels);
		System.out.println(objDataType.noOfmirrors);
		System.out.println(objDataType.chassisnumber);
		System.out.println(objDataType.isPunctured);
		System.out.println(objDataType.bikeName);
		System.out.println(objDataType.runningKM);
	}
}

