#include <stdio.h>
int main (void)
{
	//������������������ʵ���������ļӼ��˳����������������λС��
	double a,b,i;
	printf ("����������������");
	scanf ("%lf%lf",&a,&b);
	i=a/b;
	printf ("%.0lf+%.0lf=%.0lf\n",a,b,a+b);
	printf ("%.0lf-%.0lf=%.0lf\n",a,b,a-b);
	printf ("%.0lf*%.0lf=%.0lf\n",a,b,a*b);
	printf ("%.0lf/%.0lf=%.2lf",a,b,i);
	return 0;
}
