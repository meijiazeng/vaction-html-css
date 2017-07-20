#include <stdio.h>
int main (void)
{
	int a=10,b=20,c=30;
	int *num=&a;  //获取a的地址
	*num=b;     //num的数据等价于a,可以赋值给b
	c= *num;     //
	printf ("%d,%d,%d,%d",a,b,c,*num);
	return 0;
}