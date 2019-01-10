package org.launchcode;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,1,13,9,45,22,98,4};

        arr = selectionSort(arr);

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int greatest = arr.length-i-1;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[greatest])
                    greatest = j;
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[greatest];
            arr[greatest] = temp;
        }

        return arr;
    }
}
