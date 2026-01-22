import java.util.Scanner;

public class BinarySearch {
  int a[] = new int[10];
  int key;
  void getdata()
 {
    Scanner sc =  new Scanner(System.in);
    for(int i=0;i<10;i++){
    System.out.println("Enter the array elements :-");
    a[i] = sc.nextInt();
 }
    System.out.println("Enter number to search :-  ");
    key = sc.nextInt();
}

 void search()
 {
    int i,j,mid,flag,pos;
    i=0;
    j=9;
    flag=0;
    pos=-1;
    
    while (i<=j && flag==0)
    {
    mid = (i+j)/2;
    if(a[mid]==key)
    {
     flag=1;pos=mid+1;
    }
    if (a[mid]>key)
   {
    j=mid-1;
   }
    if (a[mid]<key) 
   {
    i=mid+1;
   }}
   if (flag==0) 
   {
    System.out.println("Not found");
   }
   else
   {
    System.out.println("Num found at position : " +( pos));
   }
 }
}
 
class demo
{
public static void main(String[] args)
{
BinarySearch aa =new BinarySearch();
    aa.getdata();
    aa.search();
}
}
