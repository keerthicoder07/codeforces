#include<stdio.h>
int main()
{
    char c[100];
    char c1[100];
    scanf("%s",c);
    scanf("%s",c1);
    int r1=0;
    int r2=0;
    int i=0;
    int f;
    while(c[i]!='\0' && c1[i]!='\0')
    {
        if(c[i]>='A' && c[i]<='Z')
        c[i]^=32;
        
        if(c1[i]>='A' && c1[i]<='Z')
        c1[i]^=32;
        
        if(c[i]>c1[i])
        {
        printf("1");
        return 0;
        }
        else if(c1[i]>c[i])
        {
        printf("-1");
        return 0;
        }
        i++;
    }
 
    printf("0");
    return 0;
    
}