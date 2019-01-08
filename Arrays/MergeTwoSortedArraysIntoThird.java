package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = {2,4,6,8};
	    int[] arr2 = {1,3,5,7};

	    int[] result = new int[arr1.length + arr2.length];

	    result = mergeArraysInSortedOrder(arr1,arr2,result);

	    for(int i=0; i<result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] mergeArraysInSortedOrder(int[] arr1, int[] arr2, int[] result){
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
