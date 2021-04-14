import java.lang. *;
import java.util. *;
class Main13
     {
        public static void main (String args[])
              {
                     double a,b,c;
                     System.out.println("Enter the values of a,b and c");
                     Scanner ob = new Scanner(System.in);
                     a = ob.nextDouble();
                     b = ob.nextDouble();
                     c = ob.nextDouble();
                     roots(a,b,c);
              }
        public static void roots(double a, double b, double c)
         {
                double disc, root1, root2;
                disc = b*b-4*a*c;
                if(disc<0)
                   System.out.println(" roots are complex");
               else
                 {
                          root1 = (-b+Math.sqrt(disc))/(2*a);
                          root2 = (-b+Math.sqrt(disc))/(2*a);
                          System.out.println("roots are" + root1 +" "+root2);
                    }
          }
     }