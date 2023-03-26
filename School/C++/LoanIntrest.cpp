#include <iostream>
#include <string>
#include <cmath>
#include <iomanip>
#include <fstream>
#include <cstring>

using namespace std;

int getLoan();
double deposit(double);
double loan, num2;

int main()
{
    getLoan();
    num2 = deposit(loan);
    if (num2 > 0)
        cout <<"deposit required : "<< num2;
    return 0;
}

int getLoan()
{
    cout << "Enter loan amount: ";
    cin >> loan;
    return 0.0;
}

double deposit(double loan)
{
    if (loan < 50000) {
        if (loan < 20000) {
            if (loan < 15000) {
                if (loan < 10000) {
                    return loan * .1;
                }
                else {
                    return 200 + loan * .06;
                }
            }
            else {
                return 500 + loan * .05;
            }
        }
        else {
            return 1000 + loan * .03;
        }
    }
    else {
        cout << "invalid number!";
        return -1;
    }
}
