#include<stdio.h>
int main()
{
    char a[50];
    int i,len,count=1;
    scanf("%s",a);
 for(len=0;a[len]!='\0';len++);
    if(len>20)
    {
    printf("Invalid Input");
    }
    else
    {
     for(i=0;i<len;i++)
      {
        if(a[i]==a[i+1])
       {
         count++;
       }
       else
      {
       printf("%c%d",a[i],count);
       count=1;
      }
    }
  }
  return 0;
}
