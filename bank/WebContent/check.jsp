<%@ page language="java" import="bank.domain.UserInfo"%>

<%
	Object obj=(Object)request.getSession().getAttribute("user");
	
	if (obj == null) {
		response.sendRedirect("login.jsp");
	} else {
		UserInfo userInfo = (UserInfo) obj;
	}	
%>
