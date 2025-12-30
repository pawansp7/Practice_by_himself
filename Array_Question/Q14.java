// shored array in acending order ;

class TestMain{
    public static void main(String args[]){

        int[] arr = {-8,-10,2,5,7,9,0,-85,74};
        int[] ans = sortedArray(arr);

        for(int e : ans){
            System.out.print(e +" ");
        }

    }
    static int[] sortedArray(int[] arr){

        for(int j=0; j<arr.length-1; j++){
             for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        }
       
        return arr;
    }
}