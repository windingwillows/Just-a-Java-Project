public class HeapSort {

	public static <E extends Comparable<E>> void inOrderSort(E[] list)
	{
		Heap<E> heap = new Heap<>();
		// Adding elements to the heap
		
		for( int i=0; i< list.length; i++)
			heap.add(list[i]);
		
		// Removing elements from the heap
		
		for(int i = list.length-1; i>=0; i--)
			list[i]= heap.remove();
	}
	
}
