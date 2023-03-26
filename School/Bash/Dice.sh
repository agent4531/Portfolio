RandDice(){
	#rand loop / looping thu the dice array named “dice” with length being 0..4 and setting the dice to be between 1..6
	for (( I = 1; I < 6; I++ )); do
		Dice[$I - 1]=$(( 1 + RANDOM % 6 ))
	done
}

TotalDice(){
	#using array named “dice” that has a length between 0..4 and echo’ing the total
	local total=0
	for (( I = 0; I < 5; I++ )); do
		Total=$(( total + ${Dice[$I]} ))
		echo “Die $(( I + 1 )) is : “${Dice[$I]}”.”
	done
echo “Totaling in : “$total”!”
}

Dice=(0 0 0 0 0)
RandDice
TotalDice
