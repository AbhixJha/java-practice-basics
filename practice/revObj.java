
import java.util.Scanner; 
public class revObj {
    int n;

    void getdata(int i)
    {
     n=i;
    }
    void putdata()
    {
    int Rev=0;
    while (n>0) {
     Rev=(Rev*10)+n%10;
     n=n/10;  
    }
    System.out.println("reverse :"+Rev);
    }
    public static void main(String[] args) {
        revObj aa= new revObj();
        Scanner sc = new Scanner(System.in);
        aa.getdata(27);
        aa.putdata();
    }
}
