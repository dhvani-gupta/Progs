//swapping
import java.lang.*;
import java.util.*;
class Main5
{
public static void main(String args[])
{
int a,b;
Scanner ob = new Scanner(System.in);
System.out.println("Enter a: ");
a= ob.nextInt();
System.out.println("Enter b: ");
b= ob.nextInt();
a= (a+b)-(b=a);
System.out.println("a=" +a);
System.out.println("b=" +b);
}
}

