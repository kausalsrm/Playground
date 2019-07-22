#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int l=n%100;
  int sl=l/10;
  printf("%d",sl);
  return 0;
}