#include <stdio.h>
int main (void)
{
	int a,b,c;
	int are;
	printf ("请输入三角形的三条边长");
	scanf ("%d%d%d",&a,&b,&c);
	are=(a+b+c)/2;
	printf("三角形的面积为：%d",are);
	return 0;
}