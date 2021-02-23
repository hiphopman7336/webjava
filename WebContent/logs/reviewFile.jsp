<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" import="java.io.*, java.net.*" %>
<!doctype html>
	<html>
		<link rel="icon" href="icon/responsive.png">
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>ESB Rest Services · Bootstrap</title>
		</head>
		<body>
			<a href="readLogs.jsp">Back page..</a><br>
			<%
					String filename = request.getParameter("nameFile");
					String filePath = request.getParameter("pathFile");
	
					out.println("<b>"+"File Name: "+filename+"</b><br>");							
		
					try{
						FileInputStream fstream = new FileInputStream(filePath);
						BufferedReader br = new BufferedReader(new InputStreamReader(fstream, "UTF-8"));
						String strLine;
					
						while ((strLine = br.readLine()) != null)   {
							out.println(strLine + "<br>");
						}
						
						fstream.close();
					
					} catch (Exception e) {
						out.println(e.getMessage());
					}	
						
			%>
		</body>
	</html>