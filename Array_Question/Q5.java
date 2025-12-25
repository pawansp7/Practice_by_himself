// find max value in array

class Test{
    public static void main(String args[]){
        int[] arr = {21,12,10,-1,12,-8,0};

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}