import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                 System.out.print("*");
            }
            System.out.println();
           
        }
        for(int j = n; j>=1; j--){
            for(int k=1; k<j; k++){
                  System.out.print("*");
            }
          System.out.println();
        }
    }
}