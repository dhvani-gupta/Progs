#include <stdio.h>

long add(long *, long *);
long diffe(long *,long *);
 
int main()
{
   long first, second, *p, *q, sum,diff;

   scanf("%ld%ld", &first, &second);
 
   sum = add(&first, &second);
   diff= diffe(&first, &second);
 
   printf("%ld \n", sum);
   printf("%ld", diff);
 
   return 0;
}
long add(long *x, long *y) {
   long sum;
   
   sum = *x + *y;
   
   return sum;
}
long diffe(long *x, long *y) {
long diff;

diff=(*x -*y);
if(diff<0)
{
    return -1*diff;
}
else return diff;

}
