#include <stdio.h>
int main (void)
{
	//С���μӿ��ԣ�������ΪA-D����90<=����<=100(A)  80<=����<=90(B)
		//60<=����<=80(C)  ����<60(D) С������87��
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

