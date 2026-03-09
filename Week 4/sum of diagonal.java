import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int r=0;
        int c=0;
        
        if(sc.hasNextInt()){
            r =sc.nextInt();
            c =sc.nextInt();
        
        }
        if(r == c){
            
            for(int i=0;i<r;i++)
            {
              for(int j=0;j<c;j++)
              {
                  int element=sc.nextInt();
                  if(i==j){
                      sum+=element;
                  }
                }
            }
        }
            
        System.out.println(sum);
    }
}

