package com.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.dao.commonDao;
import com.dao.userDao;
import com.dao.impl.commonDaoImpl;
import com.dao.impl.userDaoImpl;
import com.service.userService;
import com.shared.SendEmail;
import com.shared.UserBean;
import com.shared.accommodationBean;
import com.shared.committeeBean;
import com.shared.eventBean;
import com.shared.memberBean;
import com.shared.participantBean;
import com.shared.sendEmail;
import com.shared.studentBean;
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

	@Override
	public String addStudentData(studentBean bean) {
		// TODO Auto-generated method stub
		int rowsInserted;
		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertStudentData(con, bean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String addMemberData(memberBean bean) {
		// TODO Auto-generated method stub
		int rowsInserted;
		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertMemberData(con, bean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public participantBean getParticipationId(participantBean bean) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.getParticipationId(con,bean);
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<studentBean> getStudentList() {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.studentList(con);
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public committeeBean getMember(String username, String password) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			return userdao.getMember(con,username,password);
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public String addCommitteeMemberData(committeeBean bean) {
		// TODO Auto-generated method stub
		int rowsInserted;
		String msg = "Registration Failed";
		try (Connection con = comdao.getConnnection()) {
			rowsInserted = userdao.insertCommitteeMemberData(con, bean);
			if (rowsInserted >= 1) {
				msg = "Registration Successfull";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public void registrationMail(userBean bean,int eid) {
		// TODO Auto-generated method stub
		try (Connection con = comdao.getConnnection()) {
			eventBean ebean=getEvent(eid);
			System.out.println("registration mail :");
			if (ebean!=null){
				sendEmail.send("yashshah5325@gmail.com", bean.get,"Please find your Password",
						"Your password College Alumni Portal is::" + password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public eventBean getEvent(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
