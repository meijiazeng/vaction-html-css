#include <stdio.h>
#include <stdlib.h>
#define N 5
int score[100];

void input(void);
void output(void);
int score_max(void);
int score_min(void);

int main(void)
{
	int n,m;
	while(1){
		printf ("******************\n");
		printf ("***[1]输入成绩****\n");
		printf ("***[2]输出成绩****\n");
		printf ("***[3]输出最高分**\n");
		printf ("***[4]输出最低分**\n");
		printf ("请选择：");
		scanf ("%d",&n);
		switch(n)
		{
			case 1:
				printf ("输入成绩：\n");input();
				break;
			case 2:
				printf ("输出成绩：");output();
				break;
			case 3:
				m=score_max();
				printf ("最高分：%d\n",m);
				break;
			case 4:
				m=score_min();
				printf ("最低分：%d",m);
				break;
			default:
				printf ("输入错误");
		}
		printf ("\n\n\n");
	}
	system ("pause");
	return 0;
}
void input(void)
{
	for (int i=0;i<N;i++)
	{
		scanf ("%d",&score[i]);
	}
}
void output(void)
{
	for (int i=0;i<N;i++)
	{
		printf ("%d ",score[i]);
	}
	printf ("\n");
}
int score_max()
{
	int m;
	m=score[0];
	for (int i=0;i<N;i++)
	{

		if (score[i]>m)
			m=score[i];
	}
	return m;
}
int score_min()
{
	int m;
	m=score[0];
	for (int i=1;i<N;i++)
	{
		if (score[i]<m)
			m=score[i];
	}
	return m;
}
