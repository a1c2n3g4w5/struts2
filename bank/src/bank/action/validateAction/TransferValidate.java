package bank.action.validateAction;

import com.opensymphony.xwork2.ActionSupport;

public class TransferValidate extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3750677661366813564L;
	
	private int money;
	private int account;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	
	
}
