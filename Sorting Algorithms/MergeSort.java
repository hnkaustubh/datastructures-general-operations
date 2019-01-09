package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {15,11,29,19,2,22,1,14};
	    int[] result = new int[arr.length];

	    result = mergeSort(arr);

	    for(int i=0; i<arr.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] mergeSort(int[] arr){

        int n = arr.length;
        int[] result = new int[arr.length];
//        int[] result2 = new int[arr.length];

        if(n < 2)
            return arr;
        int mid = n/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[n-mid];

        for(int i=0; i<mid; i++)
            leftArray[i] = arr[i];

        for(int j=mid; j<n; j++)
            rightArray[j-mid] = arr[j];

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        result = mergeHalves(leftArray, rightArray,result);

        return result;
    }

    public static int[] mergeHalves(int[] arr1, int[] arr2, int[] result){
        int i=0,j=0,k=0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i < arr1.length){
            result[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }
        return result;
    }
}
