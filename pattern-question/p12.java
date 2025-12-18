import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}