package array;

public class Arr {
	
	public static void main(String[] args) {
		
		int arr[]={10,20,30,40};
		
		{
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);		
				
		arr[3]=arr[0];
		arr[2]=arr[1];
		arr[1]=arr[2];
		arr[0]=arr[3];
	
		System.out.println("-----------");
		System.out.println(arr.length);
		System.out.println("-----------");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		}
	}

}
