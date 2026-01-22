import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr={30,10,40,23,89,34};
        for(int ele : arr){
            System.out.println(ele +" ");
        }
        System.out.println();


       /*  int[] nums =arr; //Shallow copy
        nums[0] = 70;
        System.out.println(arr[0]); */

        int[] brr = Arrays.copyOf(arr,arr.length); //deep copy
        for(int ele : brr){
            System.out.println(ele +" ");
        }
    }
}
