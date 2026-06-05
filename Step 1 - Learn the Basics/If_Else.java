//Question Link: https://www.geeksforgeeks.org/problems/decision-making/1?utm=codolio

import java.util.Scanner;

class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if(n<m){
            System.out.println("less");
        } else if(n == m){
            System.out.println("equal");
        } else{
            System.out.println("greater");
        }
        
    }
}


/*  optimized: single expression print and close scanner
    System.out.println(n < m ? "less" : (n == m ? "equal" : "greater"));
    sc.close(); 
*/