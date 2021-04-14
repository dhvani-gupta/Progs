//array
import java.lang.*;
import java.util.*;
class Main6
{
public static void main(String args[])
{
int n;
int a[]=new int[100];
Scanner ob = new Scanner(System.in);
System.out.println(" Enter number of elements ");
n = ob.nextInt();
System.out.println(" Enter elements ");
for(int i=0;i<n;i++)
{
a[i] = ob.nextInt();
}
System.out.println(" After updation by 5 ");
for(int i=0;i<n;i++)
{
a[i]=a[i]+5;
System.out.println(a[i] + "\n");
}
}
}

