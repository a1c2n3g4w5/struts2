<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<body>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<center>
			注册成功，您的个人信息如下：<br>
			<table border="1">
				<tr>
					<td>
						用户帐号
					</td>
					<td>
						<s:property value="userInfo.userNO" />
					</td>
				</tr>
				<tr>
					<td>
						帐户余额
					</td>
					<td>
						<s:property value="userInfo.balance" />
					</td>
				</tr>
				<tr>
					<td>
						用户姓名
					</td>
					<td>
						<s:property value="userInfo.userName" />
					</td>
				</tr>
				<tr>
					<td>
						用户性别
					</td>
					<td>
						<s:property value="userInfo.userSex" />
					</td>
				</tr>
				<tr>
					<td>
						用户年龄
					</td>
					<td>
						<s:property value="userInfo.userAge" />
					</td>
				</tr>
				<tr>
					<td>
						身份证
					</td>
					<td>
						<s:property value="userInfo.idCard" />
					</td>
				</tr>
				<tr>
					<td>
						联系电话
					</td>
					<td>
						<s:property value="userInfo.tel" />
					</td>
				</tr>
				<tr>
					<td>
						城市
					</td>
					<td>
						<s:property value="userInfo.city" />
					</td>
				</tr>
				<tr>
					<td>
						详细地址
					</td>
					<td>
						<s:property value="userInfo.address" />
					</td>
				</tr>
			</table><br>
			请牢记并保管好您的帐号和密码！
			<a href="login.jsp">返回登录页面</a>
		</center>
	</body>
</html>
