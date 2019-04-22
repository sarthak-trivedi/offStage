package com.service;

import java.util.List;

import com.shared.accommodationBean;
import com.shared.committeeBean;
import com.shared.eventBean;
import com.shared.memberBean;
import com.shared.participantBean;
import com.shared.studentBean;
import com.shared.userBean;

public interface userService {
	List<eventBean> getEventList();
	userBean getUser(String username,String password);
	String addUserData(userBean bean);
	String addAccommodationData(accommodationBean bean);
	String addParticipationData(participantBean bean);
	String addMemberData(memberBean bean);
	String addStudentData(studentBean bean);
	participantBean getParticipationId(participantBean bean);
	List<studentBean>getStudentList();
	committeeBean getMember(String username,String password);
	String addCommitteeMemberData(committeeBean bean);
	void registrationMail(userBean bean,int eid);
	eventBean getEvent(int eid);
	List<userBean> getParticipantList();
	
}
