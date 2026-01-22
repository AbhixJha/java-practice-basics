import java.util.Scanner;

public class greatestnummb {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number :- ");
    int a = sc.nextInt();
    System.out.print("enter second number :- ");
    int b = sc.nextInt();
    System.out.print("enter third number :- ");
    int c = sc.nextInt();
    if (a>b && a>c ) {System.out.print("the greatest number is :-  "+a);}
    else if(b>a && b>c ) {System.out.print("the greatest number is :- "+b);}
    else if(c>a && c>b) { System.out.print("greatest number is :- "+c);}
    else { System.out.println("all numbers are same ");}
        
    
}









}
