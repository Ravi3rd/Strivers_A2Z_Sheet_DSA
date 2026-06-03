// Question Link: https://www.naukri.com/code360/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf%5C

import java.util.*;

public class Input_output {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        char character = sc.next().charAt(0);

        if(character >= 'A' && character <= 'Z'){
            System.out.println("1");
        }else if(character >= 'a' && character <= 'z'){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}