#include <stdio.h>
int jieceng(int n);   //����������
int sum(int n);

int main(void)
{
	printf ("%d",sum(10));  
	//��10����sum��ֵ
	return 0;
}
int jieceng(int n)
{
	int i;    //����ѭ��
	int result=1;   //��ʼ��result=1
	for (i=1;i<=n;i++)   //ѭ���Ƿ���ڵ���10��������������ִ�У���������ѭ��
	{
		result*=i;    //ÿһ�ν������i��ֵ����result��ֵ
	}
	return result;   //����result��ֵ���ó�result��ֵ
}
int sum(int n)
{
	int i;
	int result=0;     //��ʼ��result��ֵ����0
	for (i=1;i<=n;i++)   //ѭ���Ƿ���ڵ��ڣ�������������ִ�У���������ѭ��
	{
		result+=jieceng(i); 
		//����jieceng()������ i��ѭ������ ������һ�ξ͵���jieceng������result����sum=result
	}
	return result;   //����resultֵ
}