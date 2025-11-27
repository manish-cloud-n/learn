import java.lang.System;
import java.util.Scanner;

class getinput {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        System.out.println("Get the input from the user:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Performing arithmetic operations:");
        System.out.println(+a + b);
        System.out.println(+a - b);
        System.out.println(+a * b);
        System.out.println(+a / b);
        System.out.println(+a % b)
        int a=10;
        System.out.println(++a);
        
}