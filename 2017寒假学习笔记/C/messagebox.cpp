#include <stdio.h>
#include <windows.h>
int main ()
{
	printf ("你好");
	MessageBox(0,"你好","helloworld",0);
//	第一个参数设置为0，第一个参数是依赖的窗口编号，0是系统弹出的窗口
	//第二个参数是对话框的内容，第三个参数是对话框标题
//		第四个参数是对话框类型，0即可
	getchar();

	ShellExecute(0, "open", "notepad", 0, 0, 1);
	
	
}