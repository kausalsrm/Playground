#include<stdio.h>
int main()
{
  int n,i,search_elm;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
  scanf("%d",&arr[i]);
  }
  scanf("%d",&search_elm);
  for(i=0;i<n;i++)
  {
  if(arr[i]==search_elm)
  {
    printf("%d",i+1);
  return 0;
  }
  }
  printf("%d isn't present in the array.",search_elm);
  return 0;

}