import java.util.Scanner;
    public class add_2Darr {
    
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void getdata()
    {
        try (Scanner sc=new Scanner(System.in)) {
            for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
            System.out.println("Enter no :- ");
            a[i][j]=sc.nextInt();
            }
            for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter no :-");
                b[i][j]=sc.nextInt();
            }
        }
    }
    void add()
    {
    for(int i=0;i<3;i++)
    for(int j=0;j<3;j++)
    c[i][j]=a[i][j]+b[i][j];
    }
    void putdata()
    {
     for(int i=0;i<3;i++)
     for(int j=0;j<3;j++)
     {
      System.out.print(c[i][j]+"    ");
      System.out.println();
     }
    }
    
    public static void main(String[] args) {
        add_2Darr aa = new add_2Darr();
        aa.getdata();
        aa.add();
        aa.putdata();
    }
}
class demo{
    public static void main(String[] args) {
    add_2Darr aa =new add_2Darr();
    aa.getdata();
    aa.add();
    aa.putdata();
}}
