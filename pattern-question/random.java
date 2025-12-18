import java.util.Scanner;
import java.util.Arrays;

class Random{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void change(int arr[]){
        int i = 0;
        int j = 1;
        while(j < arr.length){
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] != 0 && arr[j] == 0){
                i++;
                j++;
            }
            else if(arr[i] != arr[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}