#include <stdio.h>
int main (void)
{
	int a=10,b=20,c=30;
	int *num=&a;  //��ȡa�ĵ�ַ
	*num=b;     //num�����ݵȼ���a,���Ը�ֵ��b
	c= *num;     //
	printf ("%d,%d,%d,%d",a,b,c,*num);
	return 0;
}