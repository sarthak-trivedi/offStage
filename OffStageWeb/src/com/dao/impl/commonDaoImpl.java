/**
 * 
 */
package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.dao.commonDao;
import com.shared.applicationConstants;

/**
 * @author Yash
 *
 */
public class commonDaoImpl implements commonDao {

	/* (non-Javadoc)
	 * @see com.dao.commonDao#getConnnection()
	 */
	@Override
	public Connection getConnnection() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;

		try {
			Class.forName(applicationConstants.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection = DriverManager.getConnection(applicationConstants.DB_URL, applicationConstants.DB_USERNAME,
				applicationConstants.DB_PASSWORD);
		return connection;
	}

	@Override
	public Map<Integer, String> getEvents() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from event";
		Map<Integer, String> map = new HashMap<>();

		try (Connection connection = getConnnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				map.put(rs.getInt("event_id"), rs.getString("event_name"));
			}
		}
		return map;
	}

	@Override
	public Map<Integer, String> getCategories(int eventId) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from participation_fee where event_id=?";
		Map<Integer, String> map = new HashMap<>();

		try (Connection connection = getConnnection();
				PreparedStatement ps = connection.prepareStatement(query);) {
			ps.setInt(1, eventId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				map.put(rs.getInt("participation_fee_id"), rs.getString("participation_category"));
			}
		}
		return map;
	}

	@Override
	public int getFees(int eventId, int participationFeeId) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from participation_fee where event_id=? and participation_fee_id=?";
		int fees=0;
		try (Connection connection = getConnnection();
				PreparedStatement ps = connection.prepareStatement(query);) {
			ps.setInt(1, eventId);
			ps.setInt(2, participationFeeId);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
				fees=rs.getInt("participation_fee");
		}
		return fees;
	}

}
