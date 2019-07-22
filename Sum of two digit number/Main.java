#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n<100)
  {
    int l=n%10;
    int f=n/10;
    int sum=l+f;
    printf("%d",sum);
  }
  return 0;
}