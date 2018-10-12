#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	srand(time(NULL));
	int i,max,min;
	int arr[30];
	int sum=0;
	float avr=0;
	min=0;
	max=0;
	
	for(i=0;i<30;i++)
	{
		arr[i]=rand()%90+10;
		printf("%d ",arr[i]);
		sum=sum+arr[i];
	}
	avr=float(sum)/30;
	printf("\n %1.2f \n", avr);
	
	for(i=0;i<30;i++)
	{
		if(arr[i]%2==0)
		{
			printf(" \n Parne cisla su %d ", arr[i]);
		}
	}
	for(i=0;i<30;i++)
	{
		if(arr[i]%3==0 && arr[i]%5==0)
		{
			printf(" \n Delitelne 3 a 5 su %d ", arr[i]);
		}
	}
	for(i=0;i<30;i++)
	{	
		if(arr[i]/10 < arr[i]%10)
		{
			printf(" \n Pekne cisla %d ", arr[i]);
		}
	}
	for(i=0;i<30;i++)
	{	
		if((arr[i]/10 + arr[i]%10)==10)
		{
			printf(" \n Ciferny sucet=10 %d ", arr[i]);
		}
	}
	max=arr[0];
	for(i=1;i<30;i++)
	{	
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	printf("\n Najvacsie cislo %d ", max);
	
	min=arr[0];
	for(i=1;i<30;i++)
	{	
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	printf("\n Najmensie cislo %d \n", min);
	
}
