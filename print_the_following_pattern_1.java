import java.util.*;
public class first{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int c=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-c;j++)
            {
                System.out.print(j);
            }
            c+=1;
            System.out.print("
");
            
        }
    }
}