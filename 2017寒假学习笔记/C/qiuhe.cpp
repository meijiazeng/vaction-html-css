#include <stdio.h>
int main (void)
{
	int sum=0,i=1;
	for (i=1;i<=20;i++)
	{
		if (i%3==0)
		{
			continue;
		}
		sum+=i;
	}
	printf ("×ÜºÍÎª£º%d",sum);
}