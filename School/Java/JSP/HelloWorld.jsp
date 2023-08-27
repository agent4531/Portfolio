<%@ page import="demo.jsp.*" %> <!-- For importing classes - use "," for more than one | can use just package or package.class--> 
<jsp:include page="header.html" /><!-- this will add the real file IE header/footer -->
<html>

<body>

<h3>Hello World - JSP</h3>

The time on the server is: <%= new java.util.Date() %>

<br/><br/>

Hello WOrld to lower is: <%= Demo.makeItLower("Hello WOrld") %>

<br/><br/>

<!-- request.* is used to pull things in the url / what is sent from the browser-->

Request > Browser = <%= request.getHeader("User-Agent") %>

<br/><br/>

Request > Lang = <%= request.getLocale() %>

<br/><br/>

Student Name: <%= request.getParameter("lastName") %>, ${param.firstName}
<!-- request.getParameter("[name in html url IE form field names]") -->
<!--you can also use ${param.lastName} where lastname is the name in html url (MUST BE FROM HTML - else wont work
		 IE form field names which does the same thing as above-->

<br/><br/>

Student Country: <%= request.getParameter("country") %>

<br/><br/>

Student Favorite Lang: <%= request.getParameter("pLang") %>

<br/><br/>

Student Known Lang:
<br/>
<ul>
	<% 
		String[] knownLang = request.getParameterValues("kLang");
		for (String i : knownLang){
			out.println("<li>" + i + "</li>");
		}
	%>
	<!-- used to for things with more then one option/response -->
</ul> 

Student Favorite Time: 
	<% 
		String udata = request.getParameter("fTime"); 

		//new Cookie
		Cookie fTimeCookie = new Cookie("myApp.fTime",udata);
		
		//set lifespan - by secs
		fTimeCookie.setMaxAge(60*60*24*365); //year
		
		//send cookie
		response.addCookie(fTimeCookie);
		
		out.println(request.getParameter("fTime"));		
		
	%>

<br/><br/>


</body>

</html>