#include <stdio.h>
#include <windows.h>
int main ()
{
	printf ("���");
	MessageBox(0,"���","helloworld",0);
//	��һ����������Ϊ0����һ�������������Ĵ��ڱ�ţ�0��ϵͳ�����Ĵ���
	//�ڶ��������ǶԻ�������ݣ������������ǶԻ������
//		���ĸ������ǶԻ������ͣ�0����
	getchar();

	ShellExecute(0, "open", "notepad", 0, 0, 1);
	
	
}