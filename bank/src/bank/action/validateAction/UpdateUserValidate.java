package bank.action.validateAction;

import bank.domain.UserInfo;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateUserValidate extends ActionSupport {
	private UserInfo userInfo;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
