package array;

public class Selectionsort {
public static void main(String[] args) {
	int array[]= {64,25,12,22,11};
	int n=array.length;
	for (int i = 0; i < array.length; i++) {
		int minimum=i;
		for(int j=i+1;j<n;j++)
		{
			if(array[j]<array[i])
			{
				minimum=j;
				int temp=array[minimum];
				array[minimum]=array[i];
				array[i]=temp;
			}
		}
		
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
}
}
