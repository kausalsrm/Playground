#include<stdio.h>
int main()
{
  float o,h,a;
  scanf("%f%f",&o,&a);
  h=sqrt((o*o)+(a*a));
  printf("%.2f",h);
  return 0;
}