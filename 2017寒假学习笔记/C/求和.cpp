#include <stdio.h>
int main (void)
{
	int sum=0;
	int i=1,flag=1;
	for (i=1;i<=100;i++)
	{
		sum+=i*flag;
		flag=-flag;
	}
	printf ("×ÜºÍÎª£º%d",sum);
}