package com.company;

public class InsertionSort {
    public static void inOrderSort(int[] list){
        for(int i =1; i<list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i-1; k>=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

}
