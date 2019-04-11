package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.shared.accommodationBean;
import com.shared.eventBean;
import com.shared.participantBean;
import com.shared.userBean;

public interface userDao {
	List<eventBean> eventList(Connection con) throws SQLException;
	userBean getUser(Connection con, String username , String password) throws SQLException;
	int insertUserData(Connection con, userBean userbean) throws SQLException;
	int insertParticipationData(Connection con,participantBean participantbean) throws SQLException;
	int insertAccommodationData(Connection con, accommodationBean accommodationbean) throws SQLException;
}
