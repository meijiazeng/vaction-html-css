#include <stdio.h>
int main (void)
{
	//�ҳ�0-50֮���������������������ֻ�ܹ���1���Լ���������������
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
