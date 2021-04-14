//constructor overloading
import java.lang.*;
import java.util.*;
class Area
{
double length,breadth,radius,area,area1;
Area()
{
Scanner ob = new Scanner(System.in);
System.out.println("Enter length: ");
length = ob.nextFloat();
System.out.println("Enter breadth: ");
breadth =ob.nextFloat();
}
Area( double radius)
{
Scanner ob1 = new Scanner(System.in);
System.out.println("Enter Radius: ");
radius = ob1.nextFloat();
}
void display()
{
area1=3.14 * radius * radius ;
System.out.println("area of circle="+ area1);
}
void display1()
{
area=length*breadth;
System.out.println("area of rectangle ="+ area);
}
}
class Main9
{
public static void main(String args[])
{
Area ob1=new Area();
ob1.display1();
Area ob2=new Area() ;
ob2.display();

}
}


