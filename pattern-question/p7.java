class Test{
    public static void main(String args[]){
        // char c = 'A';
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=i; j++){
                // if(i == 3 & j==2 || i==4 & j==2 || j==3 & i==4)
                // System.out.print(" "); 
                // else 
                // System.out.print(j);

                // option 2nd 
                if(i==j || i==5 || j==1){
                    System.out.print(j);
                }
                 else
                    System.out.print(" ");
                
            }
            
            System.out.println();
        }
    }
}