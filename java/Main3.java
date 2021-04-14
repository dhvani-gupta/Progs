//factorial by taking input
import java.util.*;
import java.lang.*;
class Main3
{
public static void main (String arguments[])
{
int i,n,fact=1;
Scanner ob = new Scanner(System.in);
n=ob.nextInt();
for(i=1;i<=n;i++)
{
fact = fact*i;
}
System.out.println(" Factorial = " +fact);
}
}