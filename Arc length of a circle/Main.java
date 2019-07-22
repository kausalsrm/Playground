#include <stdio.h>
int main()
{
  float r,a,al,pi;
  pi=3.14;
  scanf("%f%f",&r,&a);
  al=2*pi*r*(a/360);
  printf("%.2f",al);
  return 0;
}
