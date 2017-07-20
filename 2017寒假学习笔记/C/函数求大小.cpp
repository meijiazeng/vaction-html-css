#include <stdio.h>
int max(int num1,int num2)
{
	if (num1>num2)
		return num1;
	else
		return num2;
}
int main (void)
{
	int num1,num2,maxnum;
	printf ("input your number :");
	scanf ("%d%d",&num1,&num2);
	maxnum=max(num1,num2);
	printf ("max number is %d",maxnum);
	return 0;
}


