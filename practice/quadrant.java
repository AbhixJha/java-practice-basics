import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  x");
        int x = sc.nextInt();
        System.out.println("enter y ");
        int y = sc.nextInt();
        if (x==0 && y==0) System.out.println("at the origin");
        else if(x>=0 && y==0)System.out.println("point lies on x axis");
        else if(x==0 && y>=0 ) System.out.println("point lies on the y axis");
    
         else if (x>=0 && y>=0) System.out.println("1st quadrant");
         else if(x<0 && y>=0)System.out.println("2nd quadrant");
         else if (x<0 && y<0) System.out.println("3rd quadrant");
         else if (x>=0 && y<0) System.out.println("4th quadrant");  
          
         } 
}
