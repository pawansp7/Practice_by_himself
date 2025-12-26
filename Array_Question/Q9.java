//paritcular index count number of elements

class Test{

    static int digit(int[] arr,int index){

        if(index < 0 || index >= arr.length ){
            System.out.println("index not available");
            return -1;
        }

        int num = arr[index];
        int count = 0;

        if(num < 0){
            num = -num;
        }

        if(num == 0){
            return 1;
        }
        

        while(num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    
    public static void main(String args[]){
        int[] arr = {26,42,231,484};



        int result = digit(arr,12);
        if(result!=-1){
            System.out.print(result);
        }

    }
}