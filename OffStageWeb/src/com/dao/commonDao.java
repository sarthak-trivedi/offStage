package com.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface commonDao {
	Connection getConnnection() throws SQLException;
}
