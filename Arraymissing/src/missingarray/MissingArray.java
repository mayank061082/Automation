package missingarray;

import java.util.Arrays;

public class MissingArray {

	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6};
		int missingno=getmissingno(array,9);
		System.out.printf("the missing number in array %s is %d %n",Arrays.toString(array),missingno);
		
		

	}

	private static int getmissingno(int[] array, int n) {
		int acutalsum=0;
		int expectedsum=(n*(n+1)/2);
		for (int i :array)
		{
			acutalsum=acutalsum+i;
			
		}
		
		return expectedsum-acutalsum;
	}

}
