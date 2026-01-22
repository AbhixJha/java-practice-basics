import java.util.Scanner;

public class multiply2D {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element for Matrix A : ");
        for(int i=0;i<3;i++)
        for(int j=0;j<4;j++)
        {
            System.out.println("Enter no : ");
            b[i][j]=sc.nextInt();
        }
    }   
    void putdata()
    {
        System.out.println("first matrix is : ");
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        {
            System.out.print(a[i][j]+"    ");
            System.out.println();
        }
        System.out.println("second matrix is : ");
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        {
            System.out.print(b[i][j]);
            System.out.println();
        }
    }
    void multiply()
    {
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        {
            c[i][j]=0;
            for(int k=0;k<3;k++)
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
        System.out.println("Multiplication is : ");
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        System.out.print(c[i][j]);
        System.out.println();
    }
}}
void demo{
    public static void main(String[] args) {
    multiply2D aa = new multiply2D();
    aa.getClass();
    aa.putdata();
    aa.multiply();
}}
