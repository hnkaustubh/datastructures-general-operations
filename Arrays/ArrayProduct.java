package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1,2,3,4};

	    int[] sample = new int[4];

	    sample = productArray2(arr);

	    for(int i=0; i<4; i++)
            System.out.print(sample[i] + " ");
    }

    public static int[] productArray1(int[] arr){
        int product = 1;

        int[] sample = new int[4];
        for(int i=0; i<arr.length; i++){
            product =  product * arr[i];
        }

        for(int i=0; i<arr.length; i++){
            sample[i] = product / arr[i];
        }
        return sample;
    }

    public static int[] productArray2(int[] arr){
        int[] leftProduct = new int[4];
        int[] rightProduct = new int[4];
        int[] productArray = new int[4];

        leftProduct[0] = 1;
        rightProduct[arr.length-1] = 1;

        for(int i=1; i<arr.length; i++)
            leftProduct[i] = arr[i-1] * leftProduct[i-1];

        for(int j=arr.length-2; j>=0; j--)
            rightProduct[j] = arr[j+1] * rightProduct[j+1];

        for(int i=0; i<arr.length; i++)
            productArray[i] = leftProduct[i] * rightProduct[i];

        return productArray;
    }
}
