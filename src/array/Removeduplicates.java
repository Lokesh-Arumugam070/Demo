package array;

public class Removeduplicates {
	public static void main(String arg[])
	{
		int arr[]= {10,20,20,30,30,40,80};
		int length=arr.length;
		length=removeduplicate(arr,length);
		for(int i=0;i<length;i++)

		{
			System.out.print(arr[i]+" ");
		}
}
	public static int removeduplicate(int arr[],int n)
	{
		if(n==0 || n==1)
			
		{
			return n;
		}
		int  j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
			
		}
		arr[j++]=arr[n-1];
		return j;
	}
}
