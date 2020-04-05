#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <sys/types.h>
int main()
{int a, b;
char *numbers[] = {"one", "two", "three", "four", "five", "six", "seven",  "eight",  "nine", "even", "odd"};

scanf("%d\n%d", &a, &b);
      int labels_index;
  for (int i=a; i<=b; i++) {
    if (i <= 9) 
    printf ("%s\n", numbers[i-1]);
    else 
    printf ("%s\n", numbers[9+(i%2)]);


}


return 0;
}

