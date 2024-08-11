package br.com.fiap.healthsureapi.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private static final String USER = "RM94156";
	private static final String PASS = "120703";

	private static Connection conexao;

	public static Connection getConnection() throws SQLException {
		if (conexao == null || conexao.isClosed()) {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conexao = DriverManager.getConnection(URL, USER, PASS);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conexao;
	}
}
