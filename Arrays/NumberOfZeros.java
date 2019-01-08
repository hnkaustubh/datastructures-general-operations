package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1,1,1,1,1,0,0,0};
        int x = 0;

	    int result = binarySearch(arr,0,arr.length-1, x);

        System.out.println(arr.length-result);
    }

    public static int binarySearch(int[] arr, int l, int r, int x){
        if(r >= 1){
            int mid = l + (r-l)/2;

            if(arr[mid] == x)
                return mid;
            if(arr[mid] < x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }
}
