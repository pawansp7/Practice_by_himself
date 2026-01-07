//9. WAP to delete element from array at specific position.

import java.util.Arrays;
class TestMain{
    public static void main(String args[]){

        int[] arr = {1,2,5,6,8,10};
        int element = 10;

        int ans = deleteEelement(arr,element);
        
        for(int i=0; i<ans; i++){
            System.out.print(arr[i] + " ");
        }

    }

    static int deleteEelement(int[] arr, int element){

        if(element < 0 || element > arr.length-1){
            System.out.println("Invalid element ");
            return  arr.length;
        }

        for(int i=element; i<arr.length-1; i++){
          arr[i] = arr[i+1];
        }
          return arr.length-1;
    }
}