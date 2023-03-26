#include <stdio.h>
#include <math.h>                    // Note: Needed for math functions in part (3)
#include <string.h>
#include <stdlib.h>                  // for system cls
#include <stdbool.h>
#include <stdlib.h>
#include<time.h>

#pragma warning(disable : 4996)
#pragma warning(disable : 6031)
    //system("cls"); <<<<< TO CLEAR SCREEN

    //scanf("%d", &temp);
    //printf("hellow World!");

void printThings(char theWord[], int letters, int option);
void printObjects(void);
void eventLisener(void);
void fastCash(void);
void withdraw(void);
void deposit(void);
void checkBalance(void);
void getCardBack(void);
void fastCashOptions(void);
bool tryAgain(void);
void another(void);
void printReceipt(void);

int Balance = 875220;
char receipt[6][40];
int receiptLength[6];
int listReceipt = 0;


int main(void) {

	int dollar = 131;
	strcpy(receipt[listReceipt], "You used Withdraw and took :$55" + dollar);
	printf("%s", receipt[listReceipt]);

	printObjects();

	return 0;
}

bool tryAgain(void) {
	printf("Try Again? Y/N\n");
	char option = 'y';
	scanf(" %c", &option);
	
	if (option == 78 || option == 110) {
		return false;
	}else if(option == 89 || option == 121){
		return true;
	}else {
		printf("sorry I don't know what you want defalting to \"Y\"");
		return true;
	}

}

void printObjects() {
	int option = 49;
	printThings("Fast Cash", 9, option);
	option++;
	printThings("Withdraw", 8, option);
	option++;
	printThings("Deposit", 7, option);
	option++;
	printThings("Check Balance", 13, option);
	option++;
	printThings("Get Card Back", 13, option);
	eventLisener();
}

void eventLisener(void) {
	int userChoice = 5;
	scanf("%d",&userChoice);
	if (userChoice == 1) {
		system("cls");
		fastCash();
	}else if (userChoice == 2) {
		system("cls");
		withdraw();
	}else if (userChoice == 3) {
		system("cls");
		deposit();
	}else if (userChoice == 4) {
		system("cls");
		checkBalance();
	}else if (userChoice == 5) {
		system("cls");
		getCardBack();
	}
}

void fastCash(void) {
	int option = 49;
	printThings("$20.00", 6, option);
	option++;
	printThings("$40.00", 6, option);
	option++;
	printThings("$60.00", 6, option);
	option++;
	printThings("$80.00", 6, option); 
	option = 48;
	printThings("Back", 4, option);
	fastCashOptions();

}

void fastCashOptions(void) {
	int userChoice = 0;
	bool again = false;
	scanf("%d", &userChoice);
	if (userChoice == 1) {
		if (Balance > 2000) {
			Balance -= 2000;
			strcpy(receipt[listReceipt], "You used Fast Cash and took :$20.00");
			receiptLength[listReceipt++] = 35;
			checkBalance();
		}
		else {
			system("cls");
			printThings("ERROR!", 6,' ');
			again = tryAgain();
		}
	}else if (userChoice == 2) {
		if (Balance > 4000) {
			Balance -= 4000;
			strcpy(receipt[listReceipt], "You used Fast Cash and took :$40.00");
			receiptLength[listReceipt++] = 35;
			checkBalance();
		}else {
			system("cls");
			printThings("ERROR!", 6, ' ');
			again = tryAgain();
		}
	}else if (userChoice == 3) {
		if (Balance > 6000) {
			Balance -= 6000;
			strcpy(receipt[listReceipt], "You used Fast Cash and took :$60.00");
			receiptLength[listReceipt++] = 35;
			checkBalance();
		}
		else {
			system("cls");
			printThings("ERROR!", 6, ' ');
			again = tryAgain();
		}
	}else if (userChoice == 4) {
		if (Balance > 8000) {
			Balance -= 8000;
			strcpy(receipt[listReceipt], "You used Fast Cash and took :$80.00");
			receiptLength[listReceipt++] = 35;
			checkBalance();
		}
		else {
			system("cls");
			printThings("ERROR!", 6, ' ');
			again = tryAgain();
		}
	}else if (userChoice == 0) {
		system("cls");
		printObjects();
	}
	if (again == true) {
		system("cls");
		fastCash();
	}
}

void withdraw(void) {
	printf("how much would you like to withdraw? (dollars only)\n");
	bool again = false;
	int dollar;
	scanf("%d", &dollar);
	dollar = dollar * 100;
	if (dollar <= Balance && dollar>0) {
		Balance -= dollar;
		strcpy(receipt[listReceipt], "You used Withdraw and took :$55" + dollar);
		receiptLength[listReceipt++] = 35;
		checkBalance();
	}else {
		system("cls");
		printThings("ERROR!", 6, ' ');
		again = tryAgain();
	}
	if (again == true) {
		system("cls");
		withdraw();
	}
}

void deposit(void) {
	printf("how much would you like to deposit? (Cash only)\n");
	int money;
	bool again = false;
	scanf("%d", &money);
	if (money > 0) {
		money = money * 100;
		Balance += money;
		money = money / 100;
		strcpy(receipt[listReceipt], "You used Deposit and add :$" + money);
		receiptLength[listReceipt++] = 34;
		checkBalance();
	}
	else {
		system("cls");
		printThings("ERROR!", 6, ' ');
		again = tryAgain();
	}
	if (again == true) {
		system("cls");
		deposit();
	}
}

void checkBalance(void) {
	double coins = Balance + 0.01;
	coins = (coins - 0.01) / 100;
	printf("Your balance is : $%.2lf\n", coins);
	another();
}

void another(void) {
	printf("would you like to make another transaction?\n");
	char option = 'y';
	scanf(" %c", &option);

	if (option == 78 || option == 110) {
		system("cls");
		getCardBack();
	}
	else if (option == 89 || option == 121) {
		system("cls");
		printObjects();
	}
	else {
		system("cls");
		printf("sorry I don't know what you want, defalting to \"Y\"\n");
		printObjects();
	}

}

void printReceipt(void) {
	int length = 42;

	for (int i = 0; i < length; i++) {
		if (i == 0) {
			printf("%c", 218);
		}
		else if (i == (length - 1)) {
			printf("%c", 191);
		}
		else {
			printf("-");

		}
	}

	printf("\n");
	for (int z = 0; z < listReceipt; z++) {
		int spaces = (37 - receiptLength[z]) / 2;
		int y = 0;
		for (int i = 0; i < length; i++) {
			if (i == 0 || i == (length - 1)) {
				printf("|");
			}
			else {
				if (i <= spaces) {
					printf(" ");
				}
				if (i <= spaces + receiptLength[z] && !(i < spaces)) {
					printf("%c", receipt[z][y]);
					y++;
				}
				if (i < length - 2 && !(i < spaces + receiptLength[z])) {
					printf(" ");
				}
			}
		}
		printf("\n");
	}
	for (int i = 0; i < length; i++) {
		if (i == 0) {
			printf("%c", 192);
		}
		else if (i == (length - 1)) {
			printf("%c", 217);
		}
		else {
			printf("-");

		}
	}
	printf("\n");
}

void getCardBack(void) {
	printf("do you need a receipt? Y/N\n");
	char option = 'y';
	scanf(" %c", &option);

	if (option == 78 || option == 110) {
		system("cls");
		printf("Good bye");
	}
	else if (option == 89 || option == 121) {
		system("cls");
		printReceipt();
	}
	else {
		system("cls");
		printf("sorry I don't know what you want, defalting to \"Y\"\n");
		printReceipt();
	}
	
}

void printThings(char theWord[],int letters, int option) {
	int length = 20;


	for (int i = 0; i < length; i++) {
		if (i == 0) {
			printf("%c", 218);
		}
		else if (i == (length - 1)) {
			printf("%c", 191);
		}
		else {
			printf("-");

		}
	}
	int spaces = (length - letters)/2;
	int y = 0;
	printf("\n");
	for (int i = 0; i < length; i++) {
		if (i == 0 || i == (length-1)) {
			printf("|");
		}else {
			if(i<=spaces){
				printf(" ");
			}
			if (i <= spaces + letters && !(i<spaces)) {
				printf("%c", theWord[y]);
				y++;
			}
			if(i < length-2 && !(i<spaces+letters)) {
				printf(" ");
			}
		}
	}
	printf("    (%c)\n",option);
	for (int i = 0; i < length; i++) {
		if (i == 0) {
			printf("%c", 192);
		}
		else if (i == (length - 1)) {
			printf("%c", 217);
		}
		else {
			printf("-");

		}
	}
	printf("\n");
}