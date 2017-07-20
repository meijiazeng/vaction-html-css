#include <stdio.h>
#include <stdlib.h>
int jieceng(int n)
{
	int result;
	{
		if (n==0||n==1){
			result =1;
		}
		else
		{
			result=jieceng(n-1)*n;
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

