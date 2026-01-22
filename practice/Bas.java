import java.util.Scanner;

public class Bas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=new String();
         int vol=0;int cons=0;
        System.out.println("Enter string : ");
        s=sc.nextLine();
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++ )
        {
           char c=s.charAt(i);
           if (c!=' ') {
            if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
            vol++;
            else 
            cons++;
           }
        }
        System.out.println("Vowel = "+vol+"Consonant = "+cons);
        
    }
}
