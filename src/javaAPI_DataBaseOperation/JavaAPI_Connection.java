/**
 * @author chen
 * @date 20170310
 * @description 本程序讲述JDBC:数据库操作相关的类和接口
 * java.sql.Connection接口
 * 		概述：
 * 		成员函数：
 * 			【1】Statement createStatement() throws SQLException;//返回一个Statement对象，用于封装可以发送给数据库的SQL语句
 * 			【2】PreparedStatement prepareStatement(String sql) throws SQLException;
 *     				 @param sql an SQL statement that may contain one or more '?' IN parameter placeholders
 *					 @return a new default <code>PreparedStatement</code> object containing the pre-compiled SQL statement
 *			【3】
 * */
package javaAPI_DataBaseOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaAPI_Connection {
	public static void main(String[] args){
		Connection conn;
	}
}
