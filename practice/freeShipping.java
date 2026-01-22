import java.util.Scanner;

public class freeShipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total cart amount : ");
        int n = sc.nextInt();
        if(n>=50){
            System.out.print("You qualify for free shipping !");
                }
        else if(n<50){
        System.out.print("You do not qualify for free shipping.Add more items to your cart to reach Rs.50 and get free shipping");
            }
        else if(n<=0){
            System.out.print("Invalid amount.Please enter a positive number greater than zero");
        }
    }
}
