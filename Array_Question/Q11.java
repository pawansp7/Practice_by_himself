// binary search alogrithm for sorted array in acesding order ;

class Test{
    public static void main(String args[]){

        int[] arr = {-8,0,2,6,10,28,65,88};
        int target = 28;
        int ans = searchElement(arr,target);
        System.out.println(ans);

    }
    static int searchElement(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
                int mid = start + (end-start) / 2;

        if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            end = mid-1;
        }
        else if(target > arr[mid]){
            start = mid+1;
        }
        }
        return -1;
    }
}