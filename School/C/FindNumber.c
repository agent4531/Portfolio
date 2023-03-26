#include <stdio.h>

#pragma warning(disable : 4996)
#pragma warning(disable : 6031)
/*
void main() {
	int input = 1;
	int pos = 0;
	int neg = 0;
	printf("Give me some numbers, use '0' to quit!\n");
	scanf("%d", &input);
	while (input != 0) {
		if (input > 0) {
			pos += input;
			scanf("%d", &input);
		}
		else {
			neg += input;
			scanf("%d", &input);
		}
	}
	printf("Total positive:%d\n",pos);
	printf("Total negitive:%d\n", neg);
}
*/
int position(int[], int);
void main() {
	int list[10];
	int num = 0;
	int pos = -1;
	printf("What numbers do you have? 10 only!\n");
	for (int i = 0; i < 10; i++) {
		scanf("%d", &list[i]);
	}
	printf("Now what number are you looking for?\n");
	scanf("%d", &num);
	pos = position(list, num);
	printf("%d", pos);
}
int position(int list[], int num) {
	for (int i = 0; i < 10; i++) {
		if (list[i] == num) {
			return i;
		}

	}
	return -1;
}