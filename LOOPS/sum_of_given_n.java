import java.util.Scanner;
public class sum_of_given_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
        int ld = n%10;
        sum += ld;
        n /=10;
        continue;

        }
        System.out.println(sum);
    }
}
