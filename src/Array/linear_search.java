package Array;
import java.util.*;
public class linear_search {

    public static int linearsearch(int numbers[],int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
  public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number to be searched");
        int key=sc.nextInt();
        int result=linearsearch(numbers,key);
        if(result==-1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index "+result);
        }








    }
}
