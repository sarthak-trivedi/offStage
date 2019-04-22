package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.shared.accommodationBean;
import com.shared.committeeBean;
import com.shared.eventBean;
import com.shared.memberBean;
import com.shared.participantBean;
import com.shared.studentBean;
import com.shared.userBean;

public interface userDao {
	List<eventBean> eventList(Connection con) throws SQLException;
	userBean getUser(Connection con, String username , String password) throws SQLException;
	int insertUserData(Connection con, userBean partcipantbean) throws SQLException;
	int insertParticipationData(Connection con,participantBean participantbean) throws SQLException;
	int insertAccommodationData(Connection con, accommodationBean accommodationbean) throws SQLException;
	int insertStudentData(Connection con, studentBean bean) throws SQLException;
	participantBean getParticipationId(Connection con, participantBean bean) throws SQLException;
	int insertMemberData(Connection con, memberBean bean) throws SQLException;
	List<studentBean> studentList(Connection con) throws SQLException;
	committeeBean getMember(Connection con, String username, String password) throws SQLException;
	int insertCommitteeMemberData(Connection con, committeeBean bean) throws SQLException; 
	eventBean getEvent(Connection con,int eid) throws SQLException;
	List<userBean> getParticipantList(Connection con) throws SQLException;
}
