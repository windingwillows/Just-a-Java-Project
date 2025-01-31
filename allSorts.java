
public class allSorts {
	static int numberOfComparisons;
	static int numberOfMovements;
	static long startTime;
	static long endTime;
	public allSorts()
	{
		numberOfComparisons =0;
		numberOfMovements =0;
	}
	
	// All getters and setters for number of movements and number of comparisons.
	public static int getnumOfComparisons(int[] arr) 
	{
		return numberOfComparisons;
	}

	public static int getnumOfMovements(int[] arr) 
	{
		return numberOfMovements;
	}
	
	public static void setnumOfComparisons(int numOfComparisons)
	{
		allSorts.numberOfComparisons = numOfComparisons;
	}
	
	public static void setnumOfMovements(int numOfMovements)
	{
		allSorts.numberOfMovements = numOfMovements;
	}
	
	public static long getEndTime()
	{
		return endTime;
	}
	
	// The first sort is insertion sort, given by the professor in the documentation.
	public static void insertionSort(int[] arr)
	{
		startTime = System.currentTimeMillis();
		for (int i = 1; i < arr.length; i++) {
			int currentElement = arr[i];
			int k;
			numberOfComparisons++;
		for (k = i - 1; k >= 0 && arr[k] > currentElement; k--) {
			arr[k + 1] = arr[k];
			numberOfMovements++;
		}	
		arr[k + 1] = currentElement;
		
		
		}
		endTime = System.currentTimeMillis()-startTime ;
		
	}
	// The second sort is selection sort as given by the professor in the documentation.
	public static void selectionSort(int[] arr)
	{
		numberOfMovements =0;
		numberOfComparisons =0;
		startTime = System.currentTimeMillis();
		for(int i=0; i<arr.length; i++)
		{
			int currentMin = arr[i];
			int currentMinIndex = i;
			for( int j= i+1; j< arr.length; j++)
			{
				numberOfComparisons++;
				if(currentMin >arr[j])
				{
					currentMin = arr[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex !=i)
			{
				numberOfMovements++;
				arr[currentMinIndex]= arr[i];
				arr[i] = currentMin;
			} 
		}
		endTime = System.currentTimeMillis()- startTime;
		
	}
	//********************************************************************************
	// The third sort is the quick sort as given by the professor in the documentation
	public static void generateQuickSort(int[] arr)
	{
		
			numberOfComparisons = 0;
			numberOfMovements = 0;  
			startTime = System.currentTimeMillis();
			quickSort(arr,0,arr.length-1);
			endTime = System.currentTimeMillis() - startTime;

		
	}
	public static void quickSort(int[] arr, int l, int h) {
		
		if (l < h) {
    	int mid = partition(arr,l,h);
    	quickSort(arr,l,mid-1);
    	quickSort(arr,mid+1,h);
		}
		
    } 

	public static int partition(int[] arr, int l, int h) {
	int piv = arr[l];
	numberOfMovements++;
	do {
		while (l < h && arr[h] >= piv) {
				h--;
				numberOfComparisons++;  
		}
		if (l < h) {
			
			arr[l] = arr[h];
			numberOfMovements++;
			
			while (l < h && arr[l] <= piv) {
	 		  	l++;
			numberOfComparisons++;
			}
			if (l < h) {
				arr[h] = arr[l];
				numberOfMovements++;
			}
		}   
	} while (l < h);

	arr[l] = piv;
	numberOfMovements++;

	return l;
	}
//**************************************************************************************************
	// The fourth sort is the Merge Sort as given by the professor in the documentation.
	public static void mergeSort(int[] list)
	{
		startTime = System.currentTimeMillis();
		numberOfComparisons=0;
		numberOfMovements=0;
		if(list.length>1)
		{
			int firsthalf[] = new int[list.length/2];
			System.arraycopy(list, 0, firsthalf, 0, list.length/2);
			mergeSort(firsthalf);
			
			int secondhalflength = list.length - list.length/2;
			int secondhalf[]= new int[secondhalflength];
			System.arraycopy(list, list.length/2, secondhalf, 0, secondhalflength);
			mergeSort(secondhalf);
			// Combining both the lists
			merge(firsthalf, secondhalf, list);
		}
		endTime = System.currentTimeMillis()-startTime;
			
	}
	public static void merge(int[] list1, int[] list2, int[] temp)
	{
		int current1=0;
		int current2=0;
		int current3=0;
		while(current1< list1.length && current2< list2.length)
		{
			numberOfComparisons++;
			if(list1[current1]<list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
			numberOfMovements++;
		}
		while(current1<list1.length)
			temp[current3++] = list1[current1++];
		numberOfMovements++;
		while(current2< list2.length)
			temp[current3++] = list2[current2++];
		numberOfMovements++;
		
	}
	//*************************************************************************
	// The fifth sort is the heap sort as given by the professor in the documentation.
	public static void heapSort(int[] arr) {
        int n = arr.length;
        startTime = System.currentTimeMillis();
      
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
       
        for (int i=n-1; i>=0; i--)
        {
          
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            numberOfMovements++;
           
            heapify(arr, i, 0);
        }
        endTime = System.currentTimeMillis() - startTime;
    }
 

	public static void heapify(int arr[], int n, int i) {
		int largest = i;  
		int l = 2*i + 1;  
		int r = 2*i + 2;      
		if (l < n && arr[l] > arr[largest])
            largest = l;
			numberOfComparisons++;
      
			if (r < n && arr[r] > arr[largest])
				largest = r;
			numberOfComparisons++;
       
			if (largest != i)
			{
				int swap = arr[i];
				arr[i] = arr[largest];
				arr[largest] = swap;
				numberOfMovements++;
		
				heapify(arr, n, largest);
			}
	}
	//***************************************************************************
	// The last one is the radix sort given by the professor in the documentation.
	public static void RadixSort(int[] a) {
		   startTime = System.currentTimeMillis();
		        int i;
		        int m = a[0];
		        int exp = 1; 
		        int n = a.length;
		        int[] b = new int[n];
		        
		        for (i = 1; i < n; i++) {
		            if (a[i] > m)
		                m = a[i];
		        }
		        while (m / exp > 0)
		        {
		            int[] newArr = new int[10];
		 
		            for (i = 0; i < n; i++) {
		            	
		                newArr[(a[i] / exp) % 10]++;
		            	numberOfComparisons++;
		            }
		            for (i = 1; i < 10; i++) {
		                newArr[i] += newArr[i - 1];
		            	numberOfComparisons++;
		            }
		            for (i = n - 1; i >= 0; i--) {
		                b[--newArr[(a[i] / exp) % 10]] = a[i];
		            	numberOfMovements++;
		            }
		            for (i = 0; i < n; i++) {
		                a[i] = b[i];	
		            	numberOfComparisons++;
		            	numberOfMovements++;
		            }
		            exp *= 10;        
		        }
		      endTime = System.currentTimeMillis()-startTime;
		    }    
}
 



