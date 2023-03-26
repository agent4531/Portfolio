#pragma warning(disable : 4996)
#pragma warning(disable : 6031)

#include <stdio.h>

double BaseTotal = 0;
double TaxTotal = 0;

void TaxIncrease(double);

int main(){
	double baseCosts[100];
	for (int i = 0; i < 100; i++) {
		scanf("%lf", &baseCosts[i]);
		TaxIncrease(baseCosts[i]);
	}
	printf("The Total amount before taxs is :$%.2lf!\n", BaseTotal);
	printf("The Total amount after taxs is :$%.2lf\n", TaxTotal);

}

void TaxIncrease(double base) {
	double taxEnd;
	taxEnd = base * .05 + base;
	BaseTotal += base;
	TaxTotal += taxEnd;
	printf("$%.2lf is before a 5%c tax, and      $%.2lf is after a 5%c taxs\n", base, 37, taxEnd, 37);
}