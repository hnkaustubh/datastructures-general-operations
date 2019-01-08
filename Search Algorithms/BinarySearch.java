package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1,4,10,25,35,47,60,80};

	    int x = 60;
        int n = arr.length;

	    int result = binarySearch(arr, 0, n-1, x);

        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int l, int r, int x){
        if( r >= 1){
            int mid = l + (r-l)/2;

            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }
}
