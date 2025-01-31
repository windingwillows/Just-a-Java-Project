package com.company;

public class QuickSort {
    public static void inOrderSort(int[] list){
        inOrderSort(list, 0, list.length-1);
    }
    public static void inOrderSort(int[] list, int first, int last){
        if(last > first){
            int pivotIndex = partition(list,first,last);
            inOrderSort(list, first, pivotIndex-1);
            inOrderSort(list, pivotIndex+1, last);
        }
    }
    public static int partition(int[] list, int first, int last){
        int pivot = list[first]; //first element as pivot
        int low = first + 1; // index for forward search
        int high = last; // index for backwards search
        while(high > low){
            while(low <= high && list[low] <= pivot){
                low++;
            }
            while(low <=high && list[high] > pivot){
                high--;
            }
            if(high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while(high > first && list[high] >= pivot)
            high--;
        //swap pivot with list[high]
        if(pivot>list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else{
            return first;
        }
    }
}
