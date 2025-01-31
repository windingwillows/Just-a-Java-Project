import java.util.*;
public class inputOrders {
	// Constructor 
	public inputOrders()
	{}
	// Function to change the input list inOrder
	// The sort technique used is insertionSort since its easy to code.
	public int[] inOrder(int n)
	{
		int array[] = new int[n];
		for( int i=0; i<n; i++)
		{
			array[i]= i+1;
		}
		return array;
	}
	// Function to change the input list to almostOrder where part of it is random
		public void almostOrder(int[] array)
		{
			Random rn= new Random();
			int almostIndex = Math.round(array.length*8/10);
			for( int i=0; i< almostIndex; i++)
			{
				int randomIndex1 = rn.nextInt(array.length);
		        int randomIndex2 = rn.nextInt(array.length);
		        int temp = array[randomIndex1];
		        array[randomIndex1] = array[randomIndex2];
		        array[randomIndex2] = temp;
			}
		}
	
	// Function to change the input list to reverseOrder
	public int[] reverseOrder(int n)
	{
		int array[] = new int[n];
		for(int i=n; i>0; i--)
		{
			array[i] = i+1;
		}
		return array;
	}
	
	// Function to accept random input of all the values from one index to the other
	 public void randominputSort(int[] arr) {
         Random rnd = new Random();
         for (int i = arr.length - 1; i > 0; i--) {
           int index = rnd.nextInt(i + 1);
           int a = arr[index];
           arr[index] = arr[i];
           arr[i] = a;
         }
     }

	
}
