// You are using Java
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        int n=sc.nextInt();
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
        
        System.out.println(sum);
        
        
    }
}
