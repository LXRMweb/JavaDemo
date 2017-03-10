/**
 * @author chen
 * @date 20170310
 * @description ��������JDBC:���ݿ������ص���ͽӿ�
 * java.sql.Connection�ӿ�
 * 		������
 * 		��Ա������
 * 			��1��Statement createStatement() throws SQLException;//����һ��Statement�������ڷ�װ���Է��͸����ݿ��SQL���
 * 			��2��PreparedStatement prepareStatement(String sql) throws SQLException;
 *     				 @param sql an SQL statement that may contain one or more '?' IN parameter placeholders
 *					 @return a new default <code>PreparedStatement</code> object containing the pre-compiled SQL statement
 *			��3��
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
