#include <stdio.h>
int main() 
{
	int n,count=0;
  scanf("%d",&n);
  do
  {
    printf("I am a C developer\n");
    count=count+1;
  }while(count<n);
	return 0;
}