Answer_Y(){
	echo “Oh, you like to code!”
}
Answer_N(){
	echo “Oh, you don’t like to code!”
}
Answer_Q(){
	echo -n “Exiting”
	for (( I = 0; I < 4; I++ )); do
		sleep 1
		echo -n “.”
	done
	echo
}
Answer_Other(){
	echo “Sorry I don’t know what you want try again or quit (q)”
	sleep 3
	clear
	echo “Do you like to code? (y/n/q)”
	read Answer
clear
Select_Answer
}
Select_Answer(){
	Case $Answer in
		y)
			Answer_Y
			;;
		n)
			Answer_N
			;;
		q)
			Answer_Q
			;;
		*)
			Answer_Other
			;;
	esac
}
#main
clear
echo “Do you like to code? (y/n/q)”
read Answer
clear
Select_Answer
