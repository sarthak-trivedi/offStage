package com.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.dao.commonDao;
import com.dao.userDao;
import com.dao.impl.commonDaoImpl;
import com.dao.impl.userDaoImpl;
import com.service.userService;
import com.shared.accommodationBean;
import com.shared.eventBean;
import com.shared.participantBean;
import com.shared.userBean;

public class userServiceImpl implements userService {
	commonDao comdao = new commonDaoImpl();
	userDao userdao = new userDaoImpl();
	@Override
	public List<eventBean> getEventList() {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.eventList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public userBean getUser(String username, String password) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.getUser(con, username, password);
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public String addUserData(userBean bean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertUserData(con, bean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String addAccommodationData(accommodationBean bean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertAccommodationData(con, bean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String addParticipationData(participantBean bean) {
		// TODO Auto-generated method stub
		int rowsInserted;

		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertParticipationData(con, bean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}

}
