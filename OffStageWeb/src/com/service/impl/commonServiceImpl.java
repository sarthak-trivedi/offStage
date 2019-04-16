package com.service.impl;

import java.sql.SQLException;
import java.util.Map;

import com.dao.commonDao;
import com.dao.impl.commonDaoImpl;
import com.service.commonService;

public class commonServiceImpl implements commonService {
	commonDao dao=new commonDaoImpl();
	@Override
	public Map<Integer, String> selectEvents() {
		// TODO Auto-generated method stub
		try {
			return 	dao.getEvents();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Map<Integer, String> selectCategories(int eventId) {
		// TODO Auto-generated method stub
		try {
			return 	dao.getCategories(eventId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectFees(int eventId, int participationFeeId) {
		// TODO Auto-generated method stub
		try {
			return 	dao.getFees(eventId,participationFeeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
