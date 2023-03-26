ShowCards(){
	for (( I = 0; I  < 13; I++ )); do
		echo – “|”${Cards[$I]}”|”
	done
	sleep 1
echo
for (( I = 13; I  < 26; I++ )); do
		echo – “|”${Cards[$I]}”|”
	done
	sleep 1
echo
for (( I = 26; I  < 39; I++ )); do
		echo – “|”${Cards[$I]}”|”
	done
	sleep 1
echo
for (( I = 39; I  < 52; I++ )); do
		echo – “|”${Cards[$I]}”|”
	done
	sleep 1
echo
}
ShowShufCards(){
	for (( I = 0; I  < 13; I++ )); do
		echo – “|”${ShufCards[$I]}”|”
	done
	sleep 1
echo
for (( I = 13; I  < 26; I++ )); do
		echo – “|”${ShufCards[$I]}”|”
	done
	sleep 1
echo
for (( I = 26; I  < 39; I++ )); do
		echo – “|”${ShufCards[$I]}”|”
	done
	sleep 1
echo
for (( I = 39; I  < 52; I++ )); do
		echo – “|”${ShufCards[$I]}”|”
	done
	sleep 1
echo
}
CardsToSufCards(){
ShufCards=( $(shuf -e “${Cards[@]}”) )
}

#h: Hearts / s: Spades / c: Clubs / d: Diamonds
#A: Ace / K: King / Q: Queen / J: Jacks
Cards=(hA h2 h3 h4 h5 h6 h7 h8 h9 h10 hJ hQ hK sA s2 s3 s4 s5 s6 s7 s8 s9 s10 sJ sQ sK cA c2 c3 c4 c5 c6 c7 c8 c9 c10 cJ cQ cK dA d2 d3 d4 d5 d6 d7 d8 d9 d10 dJ dQ dK)
ShufCards=(0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0)

echo “We start with a fresh deck of cards as you can see …”
sleep 1
ShowCards
echo “Now to shuffle these cards …”
CardsToSufCards
ShowShufCards
