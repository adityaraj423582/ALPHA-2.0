package Competive_Programming;

public class Strong_students_in_school {
    public static int diffSum(int n,int m,int arr[])
    {


        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>m)
            {
                sum=sum+(arr[i]-m);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int m=5;
        System.out.println(diffSum(n,m,arr));
    }




}
