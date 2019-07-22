#include<stdio.h>
int main()
{
  char str[100];
  int space=0,i;

  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
   if(str[i]==' ')
      space+=1;
  }
  space++;
  printf("%d",space);
  return 0;
}