#include <stdio.h>
#include <stdlib.h>
#define N 10
int main (void)
{
	int i,j,num[10];
	printf ("������10����");
	for (i=0;i<N;i++)
	{
		scanf ("%d",&num[i]);
	}
	for (i=1;i<N;i++)    //����
	{
		for (j=0;j<N-i;j++)    //��������
		{
			if (num[j]>num[j+1])
			{
				int temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			}
		}
	}
	for (i=0;i<N;i++)
	{
		printf ("%d ",num[i]);
	}
	return 0;
	system ("pause");
}

