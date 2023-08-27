<%@page import="finalProject.*" %>
<%@page session="false" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<style><%@include file="../final.css"%></style>
	<head>
		<title>Quiz</title>
	</head>
	<body>
		
		<% 
			if(!BackEnd.start){
				BackEnd.makeRaw();
				BackEnd.findAnswers();
				BackEnd.start = true;
				out.println("this hasn't happened yet");
				out.println("<input type=hidden value=" + BackEnd.question + " id=question></input>");
								
			}else{
				out.println("Question "+ "q"+ BackEnd.question +" answer > " + BackEnd.userAnsL.get(BackEnd.question));
				BackEnd.question++;
				out.println("<input type=hidden value=" + BackEnd.question + " id=question></input>");
				
			} 
 
		%>
		<br/>
		<br/>
		<div>
		<h1>
			<span class = htmlobjs>Object 1 -> <%= BackEnd.qobj1() %></span>
			<span class = htmlobjs>Object 2 -> <%= BackEnd.qobj2() %></span>
		</h1>
		</div>
		<br/>
		<br/>
		<br/>
		<br/>
		<div>
			<h3>
			<form id=quiz action="ainput.jsp"> 
			<%
				
				out.println("<button type=submit class=htmlans value=" + BackEnd.ans.get(BackEnd.question * 4 + 0) + " name=q" + BackEnd.question + " onclick=\"ftime();\">" + BackEnd.ans.get(BackEnd.question * 4 + 0) + "</button>");
				out.println("<button type=submit class=htmlans value=" + BackEnd.ans.get(BackEnd.question * 4 + 1) + " name=q" + BackEnd.question + " onclick=\"ftime();\">" + BackEnd.ans.get(BackEnd.question * 4 + 1) + "</button>");
				out.println("<button type=submit class=htmlans value=" + BackEnd.ans.get(BackEnd.question * 4 + 2) + " name=q" + BackEnd.question + " onclick=\"ftime();\">" + BackEnd.ans.get(BackEnd.question * 4 + 2) + "</button>");
				out.println("<button type=submit class=htmlans value=" + BackEnd.ans.get(BackEnd.question * 4 + 3) + " name=q" + BackEnd.question + " onclick=\"ftime();\">" + BackEnd.ans.get(BackEnd.question * 4 + 3) + "</button>");
			 
			%>
			
			</form>
			</h3>
		</div>
		<div>
			<script>
			
			function ftime(){
				
				var element1 = document.createElement("input");
				element1.type = "hidden";
				element1.value = time;
				element1.name = "qtime";
				document.getElementById("quiz").appendChild(element1);

			}
			
	// Set the date we're counting down to
	var first = new Date();
	first.setSeconds(first.getSeconds() + 5);    
	  
	var time;
	// Update the count down every 1 second	
	var x = setInterval(function() {
		
		// Get today's date and time
		var now = new Date();
    
		// Find the distance between now and the count down date
		var distance = first - now; 
    	time = distance
    	
    	
		// Time calculations for days, hours, minutes and seconds
		
		var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    	var mils = ( distance - (Math.floor((distance % (1000 * 60)) / 1000) * 1000));  
		        
		// Output the result in an element with id="demo"
		document.getElementById("timer").innerHTML = seconds + "s " + mils + "ms ";
		
       
		// If the count down is over, write some text 
		if (distance < 1) {
			clearInterval(x);
			document.getElementById("quiz").submit(); 
		}
	}, 10); 
		 
</script>
			<span id=timer></span>
			
			
		
		</div>
	</body>
</html>