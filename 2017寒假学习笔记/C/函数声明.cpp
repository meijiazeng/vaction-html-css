#include <stdio.h>
int jieceng(int n);   //函数的声明
int sum(int n);

int main(void)
{
	printf ("%d",sum(10));  
	//把10传进sum的值
	return 0;
}
int jieceng(int n)
{
	int i;    //定义循环
	int result=1;   //初始化result=1
	for (i=1;i<=n;i++)   //循环是否大于等于10，如果不是则继续执行，否则跳出循环
	{
		result*=i;    //每一次结果等于i的值乘上result的值
	}
	return result;   //返回result的值，得出result的值
}
int sum(int n)
{
	int i;
	int result=0;     //初始化result的值等于0
	for (i=1;i<=n;i++)   //循环是否大于等于，如果不是则继续执行，否则跳出循环
	{
		result+=jieceng(i); 
		//调用jieceng()函数， i是循环次数 ，调用一次就等于jieceng函数的result加上sum=result
	}
	return result;   //返回result值
}