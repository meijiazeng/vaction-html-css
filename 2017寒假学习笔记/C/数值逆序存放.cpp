#include <stdio.h>
int main (void)
{
	//将一数组中的值按逆序存放
	int a,b,c,d,e;
	printf ("input your array a");
	scanf ("%d%d%d%d%d",&a,&b,&c,&d,&e);
	printf ("array a:\n%d %d %d %d %d\n",a,b,c,d,e);
	printf ("array a is :\n%d %d %d %d %d",e,d,c,b,a);
	return 0;
}