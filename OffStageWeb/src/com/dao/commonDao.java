package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

public interface commonDao {
	Connection getConnnection() throws SQLException;

	Map<Integer, String> getEvents() throws SQLException;

	Map<Integer, String> getCategories(int eventId) throws SQLException;

	int getFees(int eventId, int participationFeeId) throws SQLException;
}
