// search element in arry not matter arrya is sorted in accending order or decending order;

class TestMain{
    public static void main(String args[]){

        int[] arr = {10,25,45,-45,-25,-15,-5,0,10,12,25,30};
        int target = -5;
        int ans = search(arr, target);
        System.out.println(ans);


    }

    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}