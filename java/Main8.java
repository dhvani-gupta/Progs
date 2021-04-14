import java.lang.* ;
//constructors
import java.util.* ;
class Sample1
{
int x ;
float y ;
Sample1( )
{
x=10;
y=11.5f;
}
Sample1( int x1, float y1)
{
x=x1;
y=y1;
}
void display()
{
System.out.println( x+ " " + y);
}
}
class Main8
{
public static void main(String args[])
{
Sample1 ob1 =  new Sample1( );
Sample1 ob2 =  new Sample1(20,20.5f);
ob1.display();
ob2.display();
}
}