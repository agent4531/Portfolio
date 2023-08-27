<%@page import="finalProject.*" %>
<%@page session="false" %>
<%@page import="java.util.*" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<% 
						
	BackEnd.userAnsL.add(request.getParameter("q"+ BackEnd.question));
	BackEnd.setTime(request.getParameter("qtime"));

	out.println("<input type=hidden value=" + BackEnd.question + " id=question></input>");
%>
<script>
if (document.getElementById("question").getAttribute("value") < 9){
	location.href = 'quiz.jsp'; 
}else{
	location.href = 'rank.jsp'; 
}

</script>
</body>
</html>