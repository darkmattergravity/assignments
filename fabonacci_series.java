package assigments;

import java.util.Scanner;

public class fabonacci_series {

    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int n1=0;
        int n2=1;
        int sum=0;


        for (int i = 0; i<n; i++) {
            sum=n1+n2;
            n1=n2;
            n2=sum;

            
            
        }
        System.out.println(sum);
        

    }
}
