import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i =n; i>=1; i--){
            for(int k = n; k>i; k--){
                System.out.print(" ");
            }
        for(int j = 1; j<=i; j++){
            if(i==j || j==1 || i==n)
            System.out.print(j);
            else
            System.out.print("_");
        }    
        System.out.println();
        }

        }}