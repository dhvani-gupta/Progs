//constructor
import java.lang.* ;
import java.util.* ;
class Sample
{
int x ;
float y ;
Sample( )
{
Scanner ob = new Scanner(System.in);
System.out.println("Enter x:");
x = ob.nextInt( );
System.out.println("Enter y:");
y = ob.nextFloat( );
}
void display()
{
System.out.println( x+ " " + y);
}
}
class Main7
{
public static void main(String args[])
{
Sample ob1 = new Sample();
ob1.display();
}
}