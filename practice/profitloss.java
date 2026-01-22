import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter sp and cp");
    int sp = sc.nextInt();
    int cp = sc.nextInt();
    if (cp<sp){System.out.println("profit");
        
    }
    else if (cp==sp) {System.out.println("no profit,and no loss");
        
    }
    else{
        System.out.println("loss");
    }





}
    
}
