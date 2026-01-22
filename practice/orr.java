import java.util.Scanner;

public class orr {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in) ;
System.out.print("enter a number:- ");
int a = sc.nextInt() ;
if (a%5==0 || a%3==0) {System.out.println("the number is divisible");
    
}  
else{
    System.out.println("the number is not divisible by 3 and 5");
}
} 
}
