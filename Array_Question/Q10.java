//check which index element value is greater than another in 2D Array;

class Test{
    public static void main(String args[]){

        int[][] arr = {{1,2,3},{5,6,7},{8,3,1}};

        int max = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length;j++){
                sum += arr[i][j];
            }
            if(sum>max){
                max = sum;
            }
        } 
        System.out.println(max);   
    }
    
}