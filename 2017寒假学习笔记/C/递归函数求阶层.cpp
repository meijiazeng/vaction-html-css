#include <stdio.h>
#include <stdlib.h>
int jieceng(int n)   //n形参  
{
	int result;
	{
		if (n==0||n==1){   //如果n的值等于1调用就结束
			result =1;
		}
		else
		{
			result=jieceng(n-1)*n;   //把实参的数赋值给形参，直到实参的数为1时再返回
		}
	}
	return result;
}
int main (void)
{
	int result,num;
	printf ("input your number");
	scanf ("%d",&num);
	result=jieceng(num);
	printf ("!%d=%d",num,result);
	return 0;
	system ("pause");
}

