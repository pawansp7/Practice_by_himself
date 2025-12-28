// binary search array sorted in decending order ;

class TestMain{
    public static void main(String args[]){

        int[] arr = {78,85,70,45,22,10,8,2,0,-8,-15,-25};
        int target = -8;
        int ans = search(arr,target);
        System.out.println(ans);


    }
    
    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                    start = mid+1;
            }
            else if(target > arr[mid]){
                end = mid-1;
            }
            else 
                return mid;
        }
        return-1;
    }
}