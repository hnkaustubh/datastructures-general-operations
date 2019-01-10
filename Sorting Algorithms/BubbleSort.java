package org.launchcode;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,1,13,9,45,22,98,4};

        arr = bubbleSort(arr);

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
