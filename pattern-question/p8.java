import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();

        
        for(int i=1; i<=m; i++){
            for(int j=m; j>=(m+1-i); j--){
                System.out.print(j);
                
        }
         System.out.println();
         
        }
        
        

       
    }}
    