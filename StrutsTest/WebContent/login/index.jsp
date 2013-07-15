<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="个人信息管理系统"/></title>
    </head>
    <body background="../images/bg.jpg">
    <div align="center"><h1>个人信息管理系统</h1></div>
<br/><br/><br/><br/><br/>
     <div align="center">
		<s:form action="loginAction" method="post">
			<table>
				<tr>
					 <td>
					 	<s:textfield name="userName" label="用户名" size="18"></s:textfield>
					 </td>
		</tr>
			<tr>
					 <td>
					 	<s:password name="password" label="密码" size="19"></s:password>
					 </td>
		</tr>
		<tr>
			<td>
			<input type="submit" value="确定"/>
			</td>
			<td>
			<input type="reset" value="清空"/>
			</td>
		</tr>
		<tr>
			<td>
					<a href="http://localhost:8080/StrutsTest/login/register.jsp">注册</a>
			</td>
		</tr>
			
		
	</table>

</s:form>
</div>
    </body>
</html>
