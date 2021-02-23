<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" import="java.io.*, java.net.*,com.tot.th.esb.utilities.DateUtil" %>
<!doctype html>
	<html>
		<link rel="icon" href="icon/responsive.png">
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>ESB Rest Services · Monitoring</title>
		</head>
		<style>
			table, th, td {
 				 border-collapse: collapse;
  				 text-align: left;
			}
		</style>
		<body>		
			<a href="index.jsp" style="color:MediumSeaGreen;">Back page..</a><br><br>	
			<%
				String path_log;
				
				if("10.0.148.40".equals(DateUtil.getHostAddress())){				
					path_log = "C:\\Users\\USER-PC\\Documents\\Kritsana.j\\eclipse-workspaces\\eclipse-2020\\apache-tomcat-6.0.0-full jre\\Apache Software Foundation\\Tomcat 6.0\\logs\\logJava";
				
				}else {
					path_log = "/export/home/weblogic/apache-tomcat-6.0.35/logs/logJava";
				}
	
					File directoryPath = new File(path_log);
					FileFilter textFilefilter = new FileFilter(){
						public boolean accept(File file) {
							boolean isFile = file.isFile();
							if (isFile) {
								return true;
							} else {
								return false;
							}
						}
					};
		
					File filesList[] = directoryPath.listFiles(textFilefilter);
					for(File file : filesList) {
										
						String name = file.getName().toString();
						String path = file.getAbsolutePath().toString();
					
				        out.println("<table style=\"width:40%\">");
				        out.println("<tr>");
				        	out.println("<td><b>"+file.getName()+"</b></td>");
				        	out.println("<td>");
								
				        		out.println("<form action=\"reviewFile.jsp\" method=\"post\">"); 
						        out.println("<input type=\"hidden\" name=\"nameFile\" value=\""+file.getName()+"\" />");
						        out.println("<input type=\"hidden\" name=\"pathFile\" value=\""+file.getAbsolutePath()+"\" />");
						        out.println("<input formtarget=\"_blank\" type=\"submit\"/ value=\"View Log\" style=\"color:Tomato;\">");
						        out.println("</form>");		        		
						
							out.println("</td>"); 
				       		out.println("<td>");
				        
								out.println("<form action=\"downloadFile.jsp\" method=\"post\">"); 
						        out.println("<input type=\"hidden\" name=\"nameFile\" value=\""+file.getName()+"\" />");
						        out.println("<input type=\"hidden\" name=\"pathFile\" value=\""+file.getAbsolutePath()+"\" />");
						        out.println("<input type=\"submit\"/ value=\"Download Log\" style=\"color:DodgerBlue;\">");
						        out.println("</form>");
				        				        				        		
							out.println("</td>");
				        out.println("</tr>");
				        out.println("</table>");
			        
				}						
			%>

		</body>
	</html>