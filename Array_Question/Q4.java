// search paricular element in array

import java.util.Scanner;
class Test{
    public static void main(String args[]){

        int[] arr = {21,12,23,5,2,-1,-10};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to found in array");
        int num = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("found index value is "+i);
                return;
            }
        }
        System.out.println("not found");
    }
}