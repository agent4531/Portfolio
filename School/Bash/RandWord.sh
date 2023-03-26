SelectWord(){
I=$(( RANDOM % 25 ))
TheWord=${Words[$i]}
}
GuessWord(){
SelectWord
echo -n “Your word is “
echo $TheWord
}
Words=(afraid beauty coffee demand escape fiscal ground height income junior killed launch mobile notice origin phrase regime scheme threat unless victim weight yellow pocket marine)
TheWords=””

clear
GuessWord