#include <stdio.h>
int sum(void)
{
	int i,sum=0;
	for (i=1;i<=100;i++)
	{
		sum+=i;
	}
	return sum;		
}
int main (void)
{
	int a=sum();
	printf ("%d",a);
	return 0;
}

