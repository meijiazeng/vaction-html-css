#include <stdio.h>
int main (void)
{
	//小明参加考试，分数分为A-D级，90<=分数<=100(A)  80<=分数<=90(B)
		//60<=分数<=80(C)  分数<60(D) 小明考试87分
	int score=87;
	int num;
	num=score/10;
	switch (num)
	{
		case 10:
		case 9:
			printf ("A");
			break;
		case 8:
			printf ("B");
			break;
		case 7:
		case 6:
			printf ("C");
			break;
		default:
			printf ("D");
			break;
	}
	return 0;
}

