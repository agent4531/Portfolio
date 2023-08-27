<%@page import="finalProject.*" %>
<%@page session="false" %>
<%@page import="java.util.*" %>

<html>
<head>
<title>Rank</title>
</head>
<body>
<%
	BackEnd.sendToSQL();
	BackEnd.rankRaw();

	out.println("<h3>You had " + BackEnd.checkAnswers() + " points and, you had " + BackEnd.qtime + " time left<h3/><br><br>");
	out.println("<h3>While the top 10 were :<h3/>");
	int i=0;

	while (i < BackEnd.rpoints.size()){	
		out.println("<h4>Rank: " + (i+1) + " -> With " + BackEnd.rpoints.get(i) + " points | " + BackEnd.rtimes.get(i) + " milliseconds remaining<h4/>");
		i++;
	}
%>

</body>
</html>