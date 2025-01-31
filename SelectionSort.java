package com.company;

public class SelectionSort {
    public static void InOrderSort(int[] list){
        for(int i = 0; i<list.length -1; i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            //find minimum number in the list
            for(int j = i + 1; j<list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //swap list[i] with list[currentMinIndex] if necessary
            if(currentMinIndex !=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
