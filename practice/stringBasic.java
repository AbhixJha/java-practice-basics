import java.util.Scanner;

public class stringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=new String();
        String adress = new String();
        System.out.println("enter your name : ");
        name=sc.next();
        System.out.println("\n enter address : ");
        adress =sc.next();
        System.out.println("name :- "+name+"adress:- "+adress);
    }
}
