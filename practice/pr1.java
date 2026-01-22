import java.util.Scanner;

public class pr1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mark of the student:- ");
    int n= sc.nextInt();
    if(n>=90){
      System.out.println("Grade A");
    }
    else if(n>=80 && n<90){
      System.out.println("Grade B");
    }
    else if(n>=70 && n<80){
      System.out.println("Grade C");
    }
    else if(n>=60 && n<70){
      System.out.println("Grade D");
    }
    else if(n<60){
      System.out.println("Fail");
    }
   } 
}