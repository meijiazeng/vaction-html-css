#include <stdio.h>
int main (void)
{
	//找出0-50之间的所有素数，素数就是只能够被1和自己本身整除的数字
	int i,j;
	for (i=2;i<=50;i++)
	{
		for (j=2;j<i;j++)
		{
			if (i%j==0)
				break;
		}
		if (i==j)
			printf ("%d",i);
	}
	return 0;
}
