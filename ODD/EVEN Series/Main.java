#include<stdio.h>
int main()
{
int n,a,d,t1,t2;
  scanf("%d",&n);
if(n%2==1)
{
  a=0,d=2;
  int s1=(n+1)/2;
  t1= a+(s1-1)*d;
  printf("%d",t1);
  }
  else 
  {
    a=0,d=1;
    int s2=n/2;
    t2= a+(s2-1)*d;
    printf("%d",t2);
  }
    return 0;
  }