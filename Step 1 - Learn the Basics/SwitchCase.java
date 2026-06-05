// Question Link: https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1?utm=codolio

import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        switch(choice){
            case '1':
                double radius = sc.nextDouble();
                System.out.println(radius * radius * Math.PI);
                break;
            case '2':
                System.out.println(sc.nextInt() * sc.nextInt());
                break;
            default:
                System.out.println("-1");
        }
        sc.close();
    }
}