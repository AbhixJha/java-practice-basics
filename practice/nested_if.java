import java.util.Scanner;

public class nested_if {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first number:- ");
    int a = sc.nextInt();
    System.out.print("enter the second number:- ");
    int b = sc.nextInt();
    System.out.print("enter the third number:- ");
    int c = sc.nextInt();
    if (a>b) {
        if (a>c) {System.out.print("a is greatest ");}
        else{System.out.print("c is greatest");}
    }
    else {
        if (b>c) {System.out.print("b is greatest");}
        else{System.out.print("c is greatest");}
    
    }

}
}
