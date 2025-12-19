//reversed array

import java.util.Arrays;
class Test{
    public static void main(String args[]){

          int[] arr = {21,2,4,8,10,12,24,26,28};
          int start = 0;
          int end = arr.length-1;

          for(int i=start; i<=end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

          }
        System.out.print(Arrays.toString(arr));

        


    }
}