package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,11,4,6,7};
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
		
	}

}
