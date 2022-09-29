package array;

public class Insertionsort {
	public static void main(String[] args) {
		int array[]= {64,25,12,22,11};
		int n=array.length;
		for (int i = 1; i < array.length; i++) {
			for(int j=i-1;j>=0;j--)
			{
				if(array[j]>array[i])
				{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				
				}
			}
			
		}for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
