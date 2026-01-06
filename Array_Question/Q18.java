//10.WAP to to count the occurance of all element in array

class TestMain{
    public static void main(String args[]){
        
        int[] arr = {2,3,44,5,3,6,7,2,2,8,10};

        for(int i=0; i<arr.length; i++){
            if(arr[i] == -1)
                continue;
            int count = 1;    
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("this number "+arr[i]+" occure "+count+" times");
        }
        
    }
}