<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<body>
		<br>
		<br>
		<br>
		<br>
		<br>
		<center>
			<s:form action="updateUserValidate" validate="true">
				<s:token />
				用户帐号:<s:property value="#session.user.userNO" />
				<s:password name="userInfo.password" label="用户密码" />
				<s:textfield name="userInfo.tel" label="联系电话" />
				<s:textfield name="userInfo.city" label="居住城市" />
				<s:textfield name="userInfo.address" label="详细地址" />
				<s:submit value="确定" />
				<s:reset value="重置" />

			</s:form>
		</center>
	</body>
</html>
