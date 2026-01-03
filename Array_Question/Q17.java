// find floor element in array floor element is greatest number that is smaller or = target number;

class TestMain{
    public static void main(String args[]){

        int[] arr = {-89,-55,-12,-5,0,2,4,9,15,88,89,90,91};
        
        int target =50;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        if(isAsc && target < arr[start]){
            return -1;
        }
        if(!isAsc && target < arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return arr[mid];
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
                if(target < arr[mid]){
                    end = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return isAsc ? arr[end] : arr[start];
    }

}