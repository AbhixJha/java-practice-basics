import java.util.Scanner;

public class marks {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("ENTER THE MARK OBTAINED BY STUDENT :- ");
int n = sc.nextInt();
if (n>=80) System.out.print("very good");
else if(n>=60)System.out.print("good");
else if(n>=40)System.out.print("average");
else System.out.print("fail");
}   
}
