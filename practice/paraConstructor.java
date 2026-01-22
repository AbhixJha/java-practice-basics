public class paraConstructor {
    int a,b;
    void paraConstructor(int x,int y){
        a=x;
        a=y;
    }
    void putdata(){
        int c;
        c=a+b;
        System.out.println("Addition : "+c);
    }
    public static void main(String[] args) {
        int m,n;
        System.out.println("Enter the first number : ");
        m=sc.nextInt();
        System.out.println("Enter the second number : ");
        n=sc.nextInt();
        paraConstructor aa = new paraConstructor(m,n);
        aa.output();
     }
}
