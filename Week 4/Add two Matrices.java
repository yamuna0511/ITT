import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int sos=0;
        int e;
        if(sc.hasNextInt()){
            int m=sc.nextInt();
            n=sc.nextInt();
            
            int[][] m1=new int[m][n];
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    m1[i][j]=sc.nextInt();
                }
            }
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(sc.hasNextInt()){
                        e=sc.nextInt();
                        m1[i][j]+=e;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(m1[i][j]+" ");
                }
            }
            
            System.out.println();
        }
        
    }
}