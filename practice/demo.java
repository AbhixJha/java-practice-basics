
class staticObj  {
    
int roll;
String name;
static String Cname="impact college";

  void Student(int x, String y)
{
 roll = x;
 name=y;
}
void display(){
    System.out.println("Roll no of the student :"+roll+"Name of the student :"+name+"college name"+Cname);


}}
   class demo{
    public static void main(String[] args) {
        staticObj aa=new staticObj();
        aa.Student(21, "abhi");
        aa.display();
    }
}
