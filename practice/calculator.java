import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number :-");
    int a = sc.nextInt();
    System.out.println("enter the second number :-");
    int b = sc.nextInt();
    System.out.println("enter the operator");
    char op = sc.next().charAt(0);
    if (op=='+'){System.out.println(a+b);}
    else if(op=='-'){System.out.println("your number is"+(a-b));}
    else if(op=='*')System.out.println("your number is"+a*b);
    else if(op=='/')System.out.println("your number is"+a/b);
    else {System.out.println("invaliid input");}
        
    }
   } 

