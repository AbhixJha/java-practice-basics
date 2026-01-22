class staticMemFunc {
    int roll;
    string name;
    static string Cname ="xyz college";
    staticMemFunc(int x,string y) 
    {
        roll =x;
        name = y;
    }
    void display(){
        System.out.println("Name : "+name+"Roll no : "+roll+"College name : "+Cname);
    }
}
class memFunction{
public static void main (string[] args){
    staticMemFunc aa=new staticMemFunc(17,"abhi");
    aa.staticMemFunc();
    aa.display();
}}

