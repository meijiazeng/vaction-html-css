#include <stdio.h>
int main (void)
{
	int i,j,result;  
	for (i=9;i>=1;i--)    //���ѭ������9��ʼ��ÿ��ѭ����һ
	{
		for (j=1;j<=i;j++)      //�ڲ�ѭ������1��ʼ��ÿ��ѭ����һ
		{  
			result=i*j;      //�����i*j�Ľ��
			printf ("%d*%d=%d\t",i,j,result);
		}
		printf ("\n");
	}
	return 0;
}


