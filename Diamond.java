import java.util.*;
public class Diamond
{
public static void main (String[] args) 
{
    int i,j,m,n,a,b;
    System.out.print("enter the no of rows of 1s diamond ") ;
    Scanner input=new Scanner(System.in);
    n=input.nextInt();
    System.out.print("enter the no of rows of space diamond ");
    Scanner in=new Scanner(System.in);
    m=in.nextInt();
    if(n<m)
    {System.out.print("invalid entry ") ;
     System.exit(0); 
    }
    for(i=0;i<n;i++)
    {
        for(j=n-1;j>i;j--)
            System.out.print(" ") ;
            a=((2*n-1)-(2*m-1))/2;
        if(i>=n-m)
        {
          for(j=0;j<a;j++)
            System.out.print("1");
        for(b=a;b<2*i+1-a;b++)
            System.out.print(" ");
        for(j=0;j<a;j++)
            System.out.print("1");    
        }
        else
        {
        for(j=0;j<2*i+1;j++)
            System.out.print("1");
        }
         System.out.println("");
 
    }
    for(i=n;i<2*n-1;i++)
    {
        for(j=n-1;j<i;j++)
            System.out.print(" ");
        a=((2*n-1)-(2*m-1))/2;
        if(i<2*n-1-(n-m))
        {
        for(j=0;j<a;j++)
            System.out.print("1");
        for(b=a;b<2*(2*n-1-i)-1-a;b++)
            System.out.print(" ");
        for(j=0;j<a;j++)
            System.out.print("1"); 
        }
        else
        {
        for(j=2*(2*n-1-i)-1;j>0;j--)
            System.out.print("1");
        }
        System.out.println("");
    }
        
}
}
