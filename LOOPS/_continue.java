import java.util.Scanner;
public class _continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        for (int i = 1; i <=100; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i+"");
            
        }
    }
}
