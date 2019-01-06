package org.launchcode;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sum");
        int sum = scan.nextInt();
        System.out.println("Please enter the array");
        int arr[] = new int[5];

        for(int i=0; i<5; i++)
            arr[i] = scan.nextInt();

        int result[] = new int[2];

        result = twoSum(sum, arr);
        for(int i=0; i<2; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] twoSum(int sum, int arr[]){
        Hashtable ht = new Hashtable();
        int result[] = new int[2];

        for(int i=0; i<arr.length; i++){
            if(ht.containsKey(sum-arr[i])){
                result[0] = sum-arr[i];
                result[1] = arr[i];
            }else{
                ht.put(arr[i],1);
            }
        }
        return result;
    }
}
