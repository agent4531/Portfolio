StartTime=$SECONDS;

let x=0; while [ $x -lt 10 ]; do echo “It has been ”$((SECONDS – StartTime))” seconds since we started!”; sleep 1; let x=$x+1; done;

while [ 1 ]; do echo $((SECONDS - StartTime)); sleep 1; done;
