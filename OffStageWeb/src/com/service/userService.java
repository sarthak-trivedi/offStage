package com.service;

import java.util.List;

import com.shared.accommodationBean;
import com.shared.eventBean;
import com.shared.participantBean;
import com.shared.userBean;

public interface userService {
	List<eventBean> getEventList();
	userBean getUser(String username,String password);
	String addUserData(userBean bean);
	String addAccommodationData(accommodationBean bean);
	String addParticipationData(participantBean bean);
}
