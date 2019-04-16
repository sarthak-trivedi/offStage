package com.service;

import java.util.Map;

public interface commonService {
	public Map<Integer, String> selectEvents();
	public Map<Integer, String> selectCategories(int eventId);
	public int selectFees(int eventId,int participationFeeId);
}
