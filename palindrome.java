package assigments;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int r;
        int s=0;


        while (num>0) {
            r=num%10;
            s=(s*10)+r;
            num=num/10;



            
        }
        if (temp==s) {
            System.out.println("the number is pelindrom");
        }
        else System.out.println("the number is not pelindrom");


        
    }

}
