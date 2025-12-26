// search the enter index position element even or odd

import java.util.Scanner;
class Test{
    public static int check(int[] arr, int index){
        if(index >= arr.length || index < 0)
            System.out.println("index not available");

        else if(arr[index] % 2 ==0)
            System.out.print("even");

        else 
            System.out.print("odd");


        return arr[index];
    }
    public static void main(String args[]){
        int[] arr = {2,4,8,10,1,2,1,15,50,55,80};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index number");
        int num = sc.nextInt();

        int element = check(arr,num);
        System.out.print("= "+element);
    
    }
}