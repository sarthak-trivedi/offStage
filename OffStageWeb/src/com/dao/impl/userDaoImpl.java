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
import com.shared.committeeBean;
import com.shared.eventBean;
import com.shared.memberBean;
import com.shared.participantBean;
import com.shared.studentBean;
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
			bean.setEndTime(s1.getString(7));
			bean.setPrizeMoney(s1.getString(8));
			bean.setVenue(s1.getString(10));
			eventlist.add(bean);
		}
		return eventlist;
	}

	@Override
	public userBean getUser(Connection con,String username, String password) {
		// TODO Auto-generated method stub
		String p = "select * from participant where participant_email=? and password=?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(p);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet s1 = ps.executeQuery();
			userBean bean = null;
			while (s1.next()) {
				bean = new userBean();
				bean.setId(String.valueOf(s1.getInt(1)));
				bean.setName(s1.getString(2));
				bean.setCollege(s1.getString(3));
				bean.setGender(s1.getString(4));
				bean.setContact(s1.getString(5));
				bean.setAltContact(s1.getString(6));
				bean.setEmail(s1.getString(7));
				bean.setAddress(s1.getString(8));
				bean.setStudentId(s1.getString(9));
				bean.setPassword(s1.getString(10));
			}
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertUserData(Connection con, userBean participantbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into participant (participant_name,participant_college,participant_gender,participant_contact"
				+ ",participant_alt_contact,participant_email,participant_address,student_id,password) values "
				+ "(?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, participantbean.getName());
			ps.setString(2, participantbean.getCollege());
			ps.setString(3, participantbean.getGender());
			ps.setString(4, participantbean.getContact());
			ps.setString(5, participantbean.getAltContact());
			ps.setString(6, participantbean.getEmail());
			ps.setString(7, participantbean.getAddress());
			ps.setString(8, (participantbean.getStudentId()!= null)? participantbean.getStudentId(): null);
			ps.setString(9, participantbean.getPassword());
			
			
			return ps.executeUpdate();
		}
	}

	@Override
	public int insertParticipationData(Connection con, participantBean participantbean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into participation (participation_category,payment_mode,team_name,event_id,participant_id,"
				+ "participation_fee_id) values (?,?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, participantbean.getPartcipationCategory());
			ps.setString(2, participantbean.getPaymentMode());
			ps.setString(3, (participantbean.getTeamName()!=null)?participantbean.getTeamName():null);
			ps.setString(4, participantbean.getEventId());
			ps.setString(5, participantbean.getParticipantId());
			ps.setString(6, participantbean.getParticipatioFeeId());
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

	@Override
	public int insertStudentData(Connection con, studentBean bean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into student (student_id,student_name,student_programme,student_batch_year,student_email,"
				+ "student_contact,student_alt_contact,student_gender) values (?,?,?,?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getProgramme());
			ps.setString(4, bean.getBatchYear());
			ps.setString(5, bean.getEmail());
			ps.setString(6, bean.getContact());
			ps.setString(7, bean.getAltContact());
			ps.setString(8, bean.getGender());
			return ps.executeUpdate();
		}
	}

	@Override
	public participantBean getParticipationId(Connection con, participantBean bean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "select * from participation where participation_category=? and event_id=? and participant_id=?";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, bean.getPartcipationCategory());
			ps.setString(2, bean.getEventId());
			ps.setString(3, bean.getParticipantId());
			ResultSet s1 = ps.executeQuery();
			
			participantBean bean2=null;
			while (s1.next()) {
				bean2 = new participantBean();
				bean2.setId(String.valueOf(s1.getInt(1)));
			}
			return bean2;
		}
	}

	@Override
	public int insertMemberData(Connection con, memberBean bean) throws SQLException {
		// TODO Auto-generated method stub
		String q = "insert into team_member (team_member_name,team_member_email,team_member_gender,team_member_contact,"
				+ "participation_id) values (?,?,?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getEmail());
			ps.setString(3, bean.getGender());
			ps.setString(4, bean.getContact());
			ps.setString(5, bean.getParticipationId());
			return ps.executeUpdate();
		}
	}

	/* (non-Javadoc)
	 * @see com.dao.userDao#studentList(java.sql.Connection)
	 */
	@Override
	public List<studentBean> studentList(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String q = "select * from student";
		Statement stmt = con.createStatement();
		List<studentBean> studentlist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			studentBean bean = new studentBean();
			bean.setId(s1.getString(1));
			bean.setName(s1.getString(2));
			bean.setProgramme(s1.getString(3));
			bean.setBatchYear(s1.getString(4));
			bean.setEmail(s1.getString(5));
			bean.setContact(s1.getString(6));
			bean.setAltContact(s1.getString(7));
			bean.setGender(s1.getString(8));
			studentlist.add(bean);
		}
		return studentlist;
	}

	@Override
	public committeeBean getMember(Connection con, String username, String password) throws SQLException{
		// TODO Auto-generated method stub
		String p = "select * from user where user_id=? and password=?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(p);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet s1 = ps.executeQuery();
			committeeBean bean = null;
			while (s1.next()) {
				bean = new committeeBean();
				bean.setStudentId(s1.getString(1));
				bean.setPassword(s1.getString(2));
				bean.setRole(s1.getString(3));
			}
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertCommitteeMemberData(Connection con, committeeBean bean) throws SQLException{
		// TODO Auto-generated method stub
		String q = "insert into user (student_id,password,role) values (?,?,?)";
		try (PreparedStatement ps = con.prepareStatement(q)) {
			ps.setString(1, bean.getStudentId());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getRole());
			return ps.executeUpdate();
		}
	}

	@Override
	public eventBean getEvent(Connection con, int eid) throws SQLException {
		// TODO Auto-generated method stub
		String p = "select * from event where event_id=?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(p);
			ps.setInt(1, eid);
			ResultSet s1 = ps.executeQuery();
			eventBean bean = null;
			while (s1.next()) {
				bean = new eventBean();
				bean.setEventName(s1.getString(2));
				bean.setDescription(s1.getString(3));
				bean.setDate(s1.getString(4));
				bean.setStartTime(s1.getString(5));
				bean.setEventType(s1.getString(6));
				bean.setEndTime(s1.getString(7));
				bean.setPrizeMoney(s1.getString(8));
				bean.setParticipationFee(s1.getString(9));
				bean.setVenue(s1.getString(10));
			}
			return bean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<userBean> getParticipantList(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String q = "select * from event natural join participation natural join participant";
		Statement stmt = con.createStatement();
		List<userBean> participantlist = new ArrayList<>();
		ResultSet s1 = stmt.executeQuery(q);
		while (s1.next()) {
			userBean bean = new userBean();
			bean.setName(s1.getString("participant_name"));
			bean.setEmail(s1.getString("participant_email"));
			bean.setContact(s1.getString("participant_contact"));
			bean.setEventName(s1.getString("event_name"));
			participantlist.add(bean);
		}
		return participantlist;
	}

}
