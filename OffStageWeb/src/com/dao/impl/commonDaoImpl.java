/**
 * 
 */
package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

}
