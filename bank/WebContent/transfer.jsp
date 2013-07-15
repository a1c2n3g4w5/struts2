<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<%@include file="check.jsp"%>
<body>
<center>
<br><br><br><br><br>
	<s:form action="tmoneyValidate" validate="true">
	<s:token/>
	
	<s:textfield name="account" label="输入要转入的账户"></s:textfield>
	
	<s:textfield name="money" label="输入转账金额"/>
	<s:submit value="确定"/>
	<s:reset value="重置"/>
	</s:form>
</center>
</body>
</html>