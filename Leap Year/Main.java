#include<stdio.h>
int main()
{
  int y;
  scanf("%d",&y);
  int c=y%100;
  if((c==0)&& (y%400==0))
  {
    if(y%4==0)
    {
      printf("LEAP YEAR");
    }
  }
  else printf("NOT LEAP YEAR");
  return 0;
}