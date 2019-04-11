package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.userDao;
import com.shared.accommodationBean;
import com.shared.eventBean;
import com.shared.participantBean;
import com.shared.userBean;

public class userDaoImpl implements userDao {

	@Override
	public List<eventBean> eventList(Connection con) throws SQLException {
		// TODO Auto-generated method stub

		String q = "select * from event";
		Statement stmt = con.createStatement();
		List<eventBean> eventlist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			eventBean bean = new eventBean();
			bean.setEventId(s1.getString(1));
			bean.setEventName(s1.getString(2));
			bean.setDescription(s1.getString(3));
			bean.setDate(s1.getString(4));
			bean.setStartTime(s1.getString(5));
			bean.setEventType(s1.getString(6));
			bean.setEndTime(s1.getString(7));
			bean.setPrizeMoney(s1.getString(8));
			bean.setParticipationFee(s1.getString(9));
			bean.setVenue(s1.getString(10));
			bean.setUserId(s1.getString(11));
			eventlist.add(bean);
		}
		return eventlist;
	}

	@Override
	public userBean getUser(Connection con,String username, String password) {
		// TODO Auto-generated method stub
		String p = "select * from participant detail where user_name=? and password=?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(p);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet s1 = ps.executeQuery();
			userBean bean = null;
			while (s1.next()) {
				bean = new userBean();
				bean.setId(String.valueOf(s1.getInt(2)));
				bean.setName(s1.getString(3));
				bean.setEmail(s1.getString(4));
				bean.setPassword(s1.getString(5));
				bean.setContact(s1.getString(6));
				bean.setGender(s1.getString(7));
				bean.setAltContact(s1.getString(8));
				bean.setAddress(s1.getString(9));
				bean.setCollege(s1.getString(10));

			}
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertUserData(Connection con, userBean userbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into user (user_name,email_id,password,contact_no,gender) values (?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, userbean.getName());
			ps.setString(2, userbean.getEmail());
			ps.setString(3, userbean.getPassword());
			ps.setString(4, userbean.getContact());
			ps.setString(5, userbean.getGender());
			return ps.executeUpdate();
		}
	}

	@Override
	public int insertParticipationData(Connection con, participantBean participantbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into participant (participation_year,paytm_transaction_no,mode_id_fk,event_fk_id,user_fk_id) values (?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, participantbean.getYear());
			ps.setString(2, participantbean.getTransactionNo());
			ps.setString(3, participantbean.getModeId());
			ps.setString(4, participantbean.getEventId());
			ps.setString(5, participantbean.getUserId());
			return ps.executeUpdate();
		}
	}

	@Override
	public int insertAccommodationData(Connection con, accommodationBean accommodationbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into accommodation (paytm_transaction_no,no_of_days,fk_id_mode,fk_id_user) values (?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, accommodationbean.getTransactionNo());
			ps.setString(2, accommodationbean.getNoOfDays());
			ps.setString(3, accommodationbean.getModeId());
			ps.setString(4, accommodationbean.getUserId());
			return ps.executeUpdate();
		}
	}

}
