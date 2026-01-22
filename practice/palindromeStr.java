import java.util.Scanner;

public class palindromeStr {
public static void main(String[] args) {
    String str = new String();
    int flag=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string to check : ");
    str=sc.nextLine();
    int i,j;
    i=0;
    j=str.length()-1;
    flag=0;
    while (i<j && flag==0) {
        if (str.charAt(i)!=str.charAt(j)) {
            flag=1;
            break;
            
        }
        i++;
        j--;
     }
     if (flag==0)
     System.out.println("palindrome");
     else
     System.out.println("Not palindrome");
        
     

} 
}
