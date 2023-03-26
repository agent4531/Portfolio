#include <stdio.h>
#include <math.h>                  // Note: Needed for math functions in part (3)

int change = 0;
int dollars = 100;
int quarters = 25;
int dimes = 10;
int nickels = 5;
int pennies = 1;
int amount[5] = { 0,0,0,0,0 };

int main(void) {

	printf("Enter red (255):\n");
	scanf_s("%d", &change);
	if (change == 0) {
		printf("No change");
	}
	while (change > 0) {
		printf("%d", change);
		if (change >= 100) {
			amount[0] = amount[0] + 1;
			change = change - dollars;
		}
		else if (change >= 25) {
			amount[1] = amount[1] + 1;
			change = change - quarters;
		}
		else if (change >= 10) {
			amount[2] = amount[2] + 1;
			change = change - dimes;
		}
		else if (change >= 5) {
			amount[3] = amount[3] + 1;
			change = change - nickels;
		}

		else if (change >= 1) {
			amount[4] = amount[4] + 1;
			change = change - pennies;
		}
	}

	if (amount[0] > 1) {
		printf("%d Dollars\n", amount[0]);
	}
	else if (amount[0] == 1)
	{
		printf("%d Dollars\n", amount[0]);
	}
	if (amount[1] > 1) {
		printf("%d Quarters\n", amount[1]);
	}
	else if (amount[1] == 1)
	{
		printf("%d Quarter\n", amount[1]);
	}

	if (amount[2] > 1) {
		printf("%d Dimes\n", amount[2]);
	}
	else if (amount[2] == 1)
	{
		printf("%d Dime\n", amount[2]);
	}

	if (amount[3] > 1) {
		printf("%d Nickels\n", amount[3]);
	}
	else if (amount[3] == 1)
	{
		printf("%d Nickel\n", amount[3]);
	}

	if (amount[4] > 1) {
		printf("%d Pennies\n", amount[4]);
	}
	else if (amount[4] == 1)
	{
		printf("%d Penny\n", amount[4]);
	}



	return 0;
}