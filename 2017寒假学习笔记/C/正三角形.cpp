#include <stdio.h>
int main (void)
{
	int i,j,k;
	for (i=1;i<5;i++)      //���ж�����
	{
		for (j=i;j<5;j++)    //�����ÿ�еĿո�����
		{
			printf (" ");
		}
		for (k=0;k<2*i-1;k++){   //�����һ�����ж��ٸ�*����
			printf ("*");
		}
		printf ("\n");
	}
}
	