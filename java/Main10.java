//method overloading
import java.lang.*;
import java.util.*;
class Sample
{
double l,b,r;
void area(double len , double bdth)
{
double a ;
a=len*bdth;
System.out.println("Area of rectangle: " +a);
}
void area(double rad)
{
double a ;
a=3.14*rad*rad;
System.out.println("Area of rectangle: " +a);
}
}
class Main10
{
public static void main(String args[])
{
double l,b,r;
Scanner ob = new Scanner(System.in);
System.out.println("Enter l: ");
l = ob.nextDouble();
System.out.println("Enter b: ");
b = ob.nextDouble();
System.out.println("Enter r: ");
r = ob.nextDouble();
Sample ob1 = new Sample();
ob1.area(l , b);
ob1.area( r);
}
}
