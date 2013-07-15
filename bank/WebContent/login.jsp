<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<body>
	<div align="center">
    <p>&nbsp;</p>
    <p><img src="image/bar_ebanking.jpg" width="744" height="70"></p>
    <p>&nbsp;</p>
    <p><img src="image/welcome.gif" width="337" height="45"></p>
    <p>&nbsp;</p>
    <p><img src="image/perlog1.gif" width="488" height="26"></p>
    <p>&nbsp;</p>
    </div>
	<div>
		<center>
			<s:form action="loginValidate">
				<s:textfield name="userNO" label="帐号" />
				<s:password name="password" label="密码" />
				<s:submit value="确定"/>
				<s:reset value="重置"/>
			</s:form>
			<a href="regist.jsp">注册新帐户</a>
		</center>
	</div>
	</body>
</html>
