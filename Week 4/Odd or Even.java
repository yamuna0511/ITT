import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int count1=0;
        Scanner sc=new Scanner(System.in);
        int count2=0;
        int i;
        int[] arr=new int[5];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count1++;
            }
            else if(arr[i]%2==1){
                count2++;
            }
            else{
                System.out.println("invalid");
            }
        }
        System.out.println("Number of even numbers:"+count1);
        System.out.println("Number of odd numbers:"+count2);
    }
}