import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<n; i++){
            for(int k=1; k<n; k++){
                System.out.print(" ");
            }
            for(int j=i; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            System.out.print(i);
        }
        for(int i=n-1; i>=1; i--){
            System.out.print(i);
        }
        System.out.println();

         for(int i=n-1; i>=1; i--){
            for(int k=1; k<n; k++){
                System.out.print(" ");
            }
            for(int j=i; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}