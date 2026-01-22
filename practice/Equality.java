import java.util.Scanner;

public class Equality {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1=new  String();
    String str2=new String();
    System.out.println("enter the first string : ");
    str1=sc.nextLine();
    System.out.println("Enter the second string : ");
    str2=sc.nextLine();
    System.out.println("CASE SENSITIVE CHECKING : ");
    if (str1.equals(str2)) 
        System.out.println("equal string");
        else 
        System.out.println("Not equal");
        System.out.println("NON CASE SENSITIVE CHECKING : ");
        if (str1.equalsIgnoreCase(str2))
        System.out.println("Equal string ");
        else 
        System.out.println("Not equal");
        }
   } 

