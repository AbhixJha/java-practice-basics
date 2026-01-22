import java.util.ArrayList;

public class basicsofArraylist {
    public static void main(String[] args) {
      //  int[] arr = new int[6];
      //upper statement is written as below in array list:-

        ArrayList<Integer> arr= new ArrayList<>(6);
        arr.add(0,10);   //in place of arr[0]=10;
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);


      //for modifying the elements in the array:-
         arr.set(2,300);  
         System.out.println(arr);

      //for increasing the size of the array list
         arr.add(90);
         System.out.println(arr);

      //for removing a element
         arr.remove(1); 
         System.out.println(arr); 

    }
}
