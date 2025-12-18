import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int k = 1; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i*2-1; j++){
                if(i==1 || j==1 || i==n || j==2*i-1){
                    System.out.print("* ");
                }
                else System.out.print("_");
            }
            System.out.println();
        }
    }
}