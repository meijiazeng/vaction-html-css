#include <stdio.h>
int sum(int n)
{
		//���� 1+2+3+...+(n-1)+n ��ֵ��
	int i;
	for (i=n-1;i>=1;i--)
	{
		n+=i;
	}
	return n;
}
int main (void)
{
	int num,a;
	printf ("input your number is");
	scanf ("%d",&num);
	a=sum(num);
	printf ("max is the %d",a);
	return 0;
}
