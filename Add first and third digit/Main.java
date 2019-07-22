#include<stdio.h>
int main()
{
  int n,l,f;
  scanf("%d",&n);
  if(n<1000)
  {
    l=n%10;
    f=n/100;
    int sum=l+f;
    printf("%d",sum);
  }
  return 0;
}