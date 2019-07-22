#include <stdio.h>
#include <math.h>
int main()
{
  	int b,e;
  scanf("%d%d",&b,&e);
  if(e>=0)
  {
  int pwr=pow(b,e);
  printf("%d",pwr);
  }
  else
    printf("Wrong input");
  return 0;
}