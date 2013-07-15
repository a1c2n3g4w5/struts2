package bank.action;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import bank.domain.TradeInfo;
import bank.domain.UserInfo;
import bank.persistence.UserDAO;
import bank.service.TradeFacade;
import bank.service.TradeFacadeImpl;
import bank.service.UserFacade;
import bank.service.UserFacadeImpl;

public class TradeAction {

	private TradeFacade tradeFacade;
	
	TradeInfo tradeInfo;
	UserFacade userFacade;
	UserInfo userInfo;
	private String account;
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	private Integer money;

	private String tradeType;

	private Integer balance;

	private List<TradeInfo> list;

	public TradeAction() {
		tradeFacade = new TradeFacadeImpl();
		tradeInfo = new TradeInfo();
		
		userFacade=new UserFacadeImpl();
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public List<TradeInfo> getList() {
		return list;
	}

	public void setList(List<TradeInfo> list) {
		this.list = list;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String fetchMoney() throws SQLException {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String userNO = (String) (((UserInfo) session.getAttribute("user")).getUserNO());
		int userflag = ((UserInfo) session.getAttribute("user")).getUserflag();
		String tt = getTradeType();
		Integer balance = tradeFacade.selectBalance(userNO);
		tradeInfo.setUserNO(userNO);
		tradeInfo.setTrade(tt);
		tradeInfo.setBalance(balance);
		tradeInfo.setMoney(money);
		if (userflag == 1) {
			return "abilityError";
		} else {
			// ���ȡ��������ʻ��������ʾ����
			if (tradeInfo.getMoney() > balance.intValue()) {
				return "fetchError";
			} else {
				tradeFacade.fetchMoney(tradeInfo);
				return "fetchSuccess";
			}
		}
	}

	public String transferMoney() throws SQLException {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		//��ǰ�˻�
		String userNO = (String) (((UserInfo) session.getAttribute("user")).getUserNO());
		int userflag = ((UserInfo) session.getAttribute("user")).getUserflag();
		String tt = getTradeType();
		Integer balance = tradeFacade.selectBalance(userNO);
		tradeInfo.setUserNO(userNO);
		tradeInfo.setTrade(tt);
		tradeInfo.setBalance(balance);
		tradeInfo.setMoney(money);
		//��ȡҪת����˻�
		String transferNO=getAccount();
		System.out.println(transferNO);
		userInfo=userFacade.selectUser(transferNO);
		
	
		if (userflag == 1) {
			return "abilityError";
		} 
		else {
			//���Ҫת����˻�����������ʾ����
			if (userInfo==null){
				return "transfer_account_Error";
			}
			// ���ת�˽������ʻ��������ʾ����
			if (tradeInfo.getMoney() > balance.intValue()) {
				return "transfer_money_Error";
			} 
			else {
				//Ϊ�����ת�ʣ���ȡǮ��Ȼ���ת���˻���Ǯ
				tradeFacade.fetchMoney(tradeInfo);
				System.out.println(tradeInfo.getUserNO());
				tradeInfo.setUserNO(transferNO);
				System.out.println(userInfo.getUserNO());
				tradeFacade.saveMoney(tradeInfo);
				return "transferSuccess";
			}
		}
		
		
	}
	
	
	public String saveMoney() throws SQLException {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String userNO = (String) (((UserInfo) session.getAttribute("user"))
				.getUserNO());
		// ��session�л���ʻ��Ƿ�ע����־userflag
		int userflag = ((UserInfo) session.getAttribute("user")).getUserflag();
		String tt = getTradeType();
		Integer balance = tradeFacade.selectBalance(userNO);
		tradeInfo.setUserNO(userNO);
		tradeInfo.setTrade(tt);
		tradeInfo.setBalance(balance);
		tradeInfo.setMoney(money);
		// userflag==1˵���ʻ��Ѿ���ע��
		if (userflag == 1) {
			return "abilityError";
		} else {
			tradeFacade.saveMoney(tradeInfo);
			return "saveSuccess";
		}
	}

	
	public String selectBalance() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String userNO = (String) (((UserInfo) session.getAttribute("user"))
				.getUserNO());
		int userflag = ((UserInfo) session.getAttribute("user")).getUserflag();
		if (userflag == 1) {
			return "abilityError";
		} else {
			try {
				Integer balance = tradeFacade.selectBalance(userNO);
				setBalance(balance);
			} catch (SQLException e) {
				e.printStackTrace();
				return "Error";
			}
			return "selectBalance";
		}
	}

	@SuppressWarnings("unchecked")
	public String tradeInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String userNO = (String) (((UserInfo) session.getAttribute("user"))
				.getUserNO());
		try {
			List list = tradeFacade.selectTradeInfo(userNO);
			setList(list);
		} catch (SQLException e) {
			e.printStackTrace();
			return "Error";
		}
		return "selectTradeInfo";
	}
}
