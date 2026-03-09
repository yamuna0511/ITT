import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int n=0;
        int sos=0;
        int element=0;
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(sc.hasNextInt()){
                        element=sc.nextInt();
                        sos+=(long)element*element;
                    }
                    
                }
            }
            int normal=(int) Math.sqrt(sos);
            System.out.println(normal);
        }
        
    }
}