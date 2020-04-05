#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int m,n,sum1,d1;
    float a,b,sum2,d2;
	scanf("%d %d",&m,&n);
    
sum1= m+n; d1=m-n;
scanf("%f %f",&a,&b);
 d2= a-b; sum2=a+b; 
    printf("%d %d \n",sum1,d1);
    printf("%.1f %.1f",sum2,d2);
    
    return 0;
}
