echo “Do you like to code? (y/n/q)”
read Answer
clear
case $Answer in
	y)
		echo “Oh, you like to code!”
		x=1
		;;
	n)
		echo “Oh, you don’t like to code!”
		x=1
		;;
	q)
		x=1
		echo -n “Exiting”
		for (( I = 0; I < 4; I++ )); do
				sleep 1
				echo -n “.”
			done
			echo
			;;
	*)
		echo “Sorry that was not correct try again or quit (q)!”
		sleep 3	
		;;
esac