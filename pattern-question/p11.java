import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j = 1; j<=n; j++){
                if(j==1 || i==n || j==i){
                    System.out.print(i);
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}