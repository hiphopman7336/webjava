<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	  String filename = request.getParameter("nameFile");
	  String filePath = request.getParameter("pathFile");
	  response.setContentType("APPLICATION/OCTET-STREAM;charset=utf-8");
	  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
	  
	  java.io.FileInputStream fileInputStream = new java.io.FileInputStream(filePath);  
	  java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStream, "UTF-8"));
	  StringBuilder resp = new StringBuilder();
	  String line;
		while ((line = br.readLine()) != null) {
			resp.append(line);
			resp.append('\r');
		}	
			
	 br.close();
		
	 out.write(resp.toString());
	
%> 
