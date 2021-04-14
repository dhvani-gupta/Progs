//greater number
import java.lang.*;
import java.util.*;
class Main4
{
public static void main(String args[])
{
float a,b;
Scanner ob = new Scanner(System.in);
System.out.println("Enter a : ");
a= ob.nextFloat();
System.out.println("Enter b : ");
b= ob.nextFloat();
if(a<b)
{
System.out.println(b+ "is greater than " +a);
}
else if(a>b)
{
System.out.println(a+ "is greater than " +b);
}
else if(a == b)
{
System.out.println(a+ "is equal to " +b);
}
}
}
