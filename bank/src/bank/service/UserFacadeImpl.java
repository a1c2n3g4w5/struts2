package bank.service;

import java.sql.SQLException;

import bank.domain.UserInfo;
import bank.persistence.UserDAO;
import bank.persistence.UserDAOImpl;

public class UserFacadeImpl implements UserFacade {

	private UserDAO userDAO;
	
	public UserFacadeImpl() {
		userDAO = new UserDAOImpl();
	}

	public void deleteUserInfo(String userNO) throws SQLException {
		userDAO.deleteUserInfo(userNO);
	}

	public boolean login(UserInfo user) throws SQLException {
		return userDAO.login(user);
	}

	public void registService(UserInfo user) throws SQLException {
		userDAO.registService(user);
	}

	public UserInfo selectUser(String userNO) throws SQLException {
		return userDAO.selectUser(userNO);
	}

	public void updateUserInfo(UserInfo user, String userNO)
			throws SQLException {
		userDAO.updateUserInfo(user, userNO);
	}

}
