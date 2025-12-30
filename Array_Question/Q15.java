// sorted array in decending order ;

class TestMain{
    public static void main(String args[]){

        int[] arr = {65,25,0,-5,4,-8,10,12,-78};
        int[] ans = sortArray(arr);

        for(int e: ans){
            System.out.print(e+" ");
        }

    }
    static int[] sortArray(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    }