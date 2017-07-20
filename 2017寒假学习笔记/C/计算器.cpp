#include <stdio.h>
int main (void)
{
	//任意输入两个整数，实现两个数的加减乘除，除法结果保留两位小数
	double a,b,i;
	printf ("请输入两个整数：");
	scanf ("%lf%lf",&a,&b);
	i=a/b;
	printf ("%.0lf+%.0lf=%.0lf\n",a,b,a+b);
	printf ("%.0lf-%.0lf=%.0lf\n",a,b,a-b);
	printf ("%.0lf*%.0lf=%.0lf\n",a,b,a*b);
	printf ("%.0lf/%.0lf=%.2lf",a,b,i);
	return 0;
}
