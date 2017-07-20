#include <stdio.h>
#include <stdlib.h>
int main (void)

//	输入一个三位数：求位数和
{
	int num;
	scanf ("%d",&num);
	int a,b,c,sum;
	a = num/100;  //求得百位上的数
	b = num/10%10;    //求得十位上的数
	c = num%10;			//求得个位上的数
	sum = a+b+c;
	printf ("%d",sum);
	system ("pause");
}