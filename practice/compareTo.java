import java.util.Scanner;

public class compareTo {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1  = new String();
     String  s2=new String();
     System.out.println("Enter first string : ");
     s1=sc.nextLine();
     System.out.println("Enter second string : ");
     s2=sc.nextLine();
     if (s1.compareTo(s2)==0) 
     System.out.println("Equal string ");
     else if (s1.compareTo(s2)>0) 
     System.out.println("first string greater than second");
     else
     System.out.println("second string is greater");
   } 
}
