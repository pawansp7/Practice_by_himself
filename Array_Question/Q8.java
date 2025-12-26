// search all even nuumbers in array

class Test{
    public static void main(String args[]){

        int[] arr = {10,2,-5,10,20,1,7,13};
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==0){
                count++;
            }    
        }
        System.out.println("even element available in array is "+count);
    }
}