#include <stdio.h>
#include <stdlib.h>
#define N 10
int main (void)
{
	int num[10],i,j,max;
	printf ("请输入10个整数");
	for (i=0;i<N;i++)
	{
		scanf ("%d",&num[i]);
	}
	for (i=0;i<N;i++)
	{
		for (max=j=i;j<N;j++)
		{
			if (num[j]>num[max])
			{
				max=j;
			}
		}
		int temp=num[i];
		num[i]=num[max];
		num[max]=temp;
	}
	for (i=0;i<N;i++)
	{
			printf ("%d ",num[i]);
	}
	return 0;
}
	