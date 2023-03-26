Names=(Evan John Tom Luz);

echo -e “So the people we have today is ${Names[*]}\n\n”;

echo “The seating chart for the class will be …”;
for I in {0..3};do echo “In seat $I is ${Names[$I]}”;done;
echo;echo;

echo -e “Now we are going to pair up so ${Names[0]} and ${Names[2]} are paired \nand ${Names[1]} and ${Names[3]} are paired!”;
