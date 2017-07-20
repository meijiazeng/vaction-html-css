#include <stdio.h>
int main (void)
{
	int i,j,k;
	for (i=1;i<5;i++)      //共有多少行
	{
		for (j=i;j<5;j++)    //计算出每行的空格数量
		{
			printf (" ");
		}
		for (k=0;k<2*i-1;k++){   //计算出一行中有多少个*符号
			printf ("*");
		}
		printf ("\n");
	}
}
	