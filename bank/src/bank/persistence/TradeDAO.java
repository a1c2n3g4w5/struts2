package bank.persistence;

import java.sql.SQLException;
import java.util.List;

import bank.domain.TradeInfo;

public interface TradeDAO {
	/**
	 * 存款业务
	 */
	void saveMoney(TradeInfo tradeInfo)
			throws SQLException;
	/**
	 * 取款业务
	 * @param userNO 当前登录用户帐号
	 * @param money 取款金额
	 * @param s 交易类型：取款
	 * @param balance 当前帐户余额
	 */
	void fetchMoney(TradeInfo tradeInfo)
			throws SQLException;
	/**
	 * 查询帐户余额
	 * @param userNO 当前登录用户帐号
	 * @return 返回帐户余额
	 */
	Integer selectBalance(String userNO) throws SQLException;
	/**
	 * 查询当前登录用户所有交易信息
	 * @param userNO 当前登录用户帐号
	 * @return 返回交易信息
	 */
	List selectTradeInfo(String userNO) throws SQLException;
}
