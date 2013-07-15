<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>

<body>
<center>
<br><br><br><br><br>
	<s:form action="smoneyValidate" validate="true">
	<s:token/>
	<s:textfield name="money" label="输入存款金额"/>
	<s:submit value="确定"/>
	<s:reset value="重置"/>
	</s:form>
</center>
</body>
</html>