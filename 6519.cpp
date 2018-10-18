#include <stdio.h>

int main()
{
	int a,b,c,temp;
	c=0;
	int vys=0;
	
	printf("Type 1.number: ");
	scanf("%d", &a);
	printf("Type 2.number: ");
	scanf("%d", &b);
	
	
	while(a%b!=0){
		if(a>b){
			if(a%b==0){
				printf("%d",b);
           		break;
			}
			else{
				a=a-b;
				printf("%d", b);
			}
	}
	a=c;
	b=a;
	c=b;
    }
    printf("%d", b);
}
		
