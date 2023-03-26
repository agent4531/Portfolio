NUM2=””;
NUM1=””;
OPER=””;
echo “What is the first number?”;
read NUM1;
echo “And the second?”;
read NUM2;
echo -e “And what do you want to do with them?\n[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide {Remember their will not a decimal}”;
if [[ $OPER –eq 1 ]] ; then
	echo $(($NUM1+$NUM2));
else
	if [[ $OPER –eq 2 ]] ; then
		echo $(($NUM1-$NUM2));
else
		if [[ $OPER –eq 3 ]] ; then
			echo $(($NUM1*$NUM2));
else
			if [[ $OPER –eq 4 ]] ; then
				echo $(($NUM1/$NUM2));
else
	clear;
	echo “Error”;
fi;
		fi;
	fi;
fi;
#please note this was an early made script that after learing more can be adapted with elif