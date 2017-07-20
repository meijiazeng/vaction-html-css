#include <stdio.h>
int main (void)
{
	int i,j,result;  
	for (i=9;i>=1;i--)    //外层循环，从9开始，每次循环减一
	{
		for (j=1;j<=i;j++)      //内层循环，从1开始，每次循环加一
		{  
			result=i*j;      //计算出i*j的结果
			printf ("%d*%d=%d\t",i,j,result);
		}
		printf ("\n");
	}
	return 0;
}


