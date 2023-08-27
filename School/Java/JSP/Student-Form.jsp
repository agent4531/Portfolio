<!--  cookies are apart of javax.servlet.http not needed to import it -->
<%@ page import="demo.jsp.*" %>

<html>

<body>


<%

//reading cookies

	String fTimeCookie = "Noon";
		
	Cookie[] theCookies = request.getCookies();
		
	if (theCookies != null) {
		for (Cookie i : theCookies) {
			if("myApp.fTime".equals(i.getName())) {
				fTimeCookie = i.getValue();
				break;
			}
		}
	}
%>

<form action="HelloWorld.jsp">

	First name: <input type="text" name="firstName">
	
	<br/><br/>
	
	Last name: <input type="text" name="lastName">
	
	<br/><br/>
	
	Country: 
	<select name="country">
		<option>Canada</option>
		<option>United States</option>
		<option>Mexico</option>
	</select>
	
	<br/><br/>
	
	Favorite Programming Language:
		<br/>
		<input type="radio" name="pLang" value="Java">Java
		<input type="radio" name="pLang" value="C++">C++
		<input type="radio" name="pLang" value="PHP">PHP
		
	<br/><br/>
	
	Known Programming Language:
		<br/>
		<input type="checkbox" name="kLang" value="Java">Java
		<input type="checkbox" name="kLang" value="C++">C++
		<input type="checkbox" name="kLang" value="PHP">PHP	
	
	<br/><br/>
	
	Favorite Time (Cookie):
		<select name="fTime">
			<option <% if("Morning".equals(fTimeCookie)){out.print("selected");}%>>Morning</option>
			<option <% if("Noon".equals(fTimeCookie)){out.print("selected");}%>>Noon</option>
			<option <% if("Night".equals(fTimeCookie)){out.print("selected");}%>>Night</option>
		</select>
		
	<br/><br/>
	
	<input type="submit" value="Submit" />

</form>

</body>

</html>