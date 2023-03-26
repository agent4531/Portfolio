#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

void menu(int);
void Double(int);
void Reverse(int);
void Raise(int);
void Sum(int);
void Power(int);
void IDK(int);
void Prime(int);
void End(int);


int main() {
    int num;
    srand(time(NULL));
    num = rand()%100;
    cout << "your number: " << num << endl << endl;
    menu(num);

    return 0;
}
void menu(int num){
  cout << "1) Double the number!" << endl;
  cout << "2) Reverse the digits of the number!" << endl;
  cout << "3) Raise the number to the power of        2, 3, or 4!"           <<endl;
  cout << "4) Sum the digits of the number!" << endl;
  cout << "5) Power!" << endl;
  cout << "6) ?" << endl;
  int input;
  cin >> input;
  switch(input){
    case 1:
      Double(num);
      break;
    case 2:
      Reverse(num);
      break;
    case 3:
      Raise(num);
      break;
    case 4:
      Sum(num);
      break;
    case 5:
      Power(num);
      break;
    case 6:
      IDK(num);
      break;
    default:
      cout << "ERROR! I didn't understand that try again!" << endl;
      menu(num); 
  }
}
void Double(int num){
  num = num * num;
  End(num);
}
void Reverse(int num){
  if(num<10){
    num = num;
  } else if (num < 100){
    int one = num % 10;
    int two = ((num % 100) - one) / 10;
    num = (one * 10) + two;
  } else {
    int one = num % 10;
    int two = ((num % 100) - one) / 10;
    int three = ((num % 1000)- two - one) / 100;
    num = (one * 100)+(two * 10) + three;
  }
  End(num);
}
void Raise(int num){
  cout << "How high?(2,3,4): " << endl;
  int input;
  cin >> input;
  switch(input){
    case 2:
      num = num * num;
      break;
    case 3:
      num = num * num * num;
      break;
    case 4:
      num = num * num * num * num;
      break;
    default:
      cout << "ERROR! I didn't understand that try again!" << endl;
      Raise(num);
      break;
    }

  End(num);
}
void Sum(int num){
  if(num<10){
    num = num;
  } else if (num < 100){
    int one = num % 10;
    int two = ((num % 100) - one) / 10;
    num = (one) + two;
  } else {
    int one = num % 10;
    int two = ((num % 100) - one) / 10;
    int three = ((num % 1000)- two - one) / 100;
    num = (one)+(two) + three;
  }
  End(num);
}
void Power(int num){
  if (num < 100 && num > 10){
    int one = num % 10;
    int two = ((num % 100) - one) / 10;
    num = pow(one,two);
  } else{
    cout << "..." << endl << "that didn't do anything" << endl << "..." << endl << "anyways" << endl << "..." << endl;
  }
  
  End(num);
}
void IDK(int num){
  if (num < 1000 && num > 100){
    int one = num % 10;
    int two = ((num % 100) - one) / 10;
    int three = ((num % 1000)- two - one) / 100;
    if(three <= 4){
      num = (one) + two;
      switch(three){
        case 2:
          num = num * num;
          break;
       case 3:
         num = num * num * num;
         break;
       case 4:
         num = num * num * num * num;
         break;
       default:
         num = num;
         break;
       }
    }
  } else{
    cout << "..." << endl << "that didn't do anything" << endl << "..." << endl << "anyways" << endl << "..." << endl;
  }
  End(num);
}
void End(int num){
  if (num < 10){
    num =+ 10;
  }
  Prime(num);
}
void Prime(int num){
  bool prime = true;
  if(num < 3){
      prime = true;

    } else if(num % 2 == 0){
      prime = false;

    } else{
      for(int i = 3; i < sqrt(num); i = i + 2){
        if(num % i == 0){
          prime = false;
        }
      }
    }
    if (prime){
      cout << "is prime" << endl;
    } else{
      cout << "is not prime" << endl;
    }
  menu(num);
}
