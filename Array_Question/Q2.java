//swap two number in array

import java.util.Scanner;
import java.util.Arrays;
class Test{

    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String args[]){


        int[] arr = {21,24,26,25,28,20};

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(arr,num1,num2);
            
        System.out.print(Arrays.toString(arr));
    }
}