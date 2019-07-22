#include<stdio.h>
int main()
{
 int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if((a>b && a>c && b>c)||(c>a && b>a && c>b))
  {
    printf("%d",b);
}
  else if((b>a && b>c && a>c)||(c>a && c>b && a>b))
  {
    printf("%d",a);
  }
  else if((a>c && c>b && a>b)||(b>c && c>a && b>a))
    printf("%d",c);
  return 0;
}