#include <stdio.h>
#include <stdlib.h>
int main (void)

//	����һ����λ������λ����
{
	int num;
	scanf ("%d",&num);
	int a,b,c,sum;
	a = num/100;  //��ð�λ�ϵ���
	b = num/10%10;    //���ʮλ�ϵ���
	c = num%10;			//��ø�λ�ϵ���
	sum = a+b+c;
	printf ("%d",sum);
	system ("pause");
}