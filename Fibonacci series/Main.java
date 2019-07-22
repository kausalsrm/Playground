#include<stdio.h>
int main()
{
 int n,i,n1=1,n2=0,next;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ",n2);
  next=n1+n2;
    n2=n1;
    n1=next;
  }  
  return 0;
}