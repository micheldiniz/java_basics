package lecture44.learnJDBC.com.java_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JDBCDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		int rowsAffected = 0;
		String url = "jdbc:mysql://localhost:3306/employees_database";

		try (InputStream input = new FileInputStream("config.properties");) {
			prop.load(input);
		} catch (IOException e1) {
			System.out.println("File not Found");
		}

		String user = prop.getProperty("dbuser");
		String password = prop.getProperty("dbpassword");

		// Establish Connection Object
		try (Connection conn = DriverManager.getConnection(url, user, password)) {

			// create a statement object to send to the database
			Statement statement = conn.createStatement();

			rowsAffected = statement.executeUpdate("insert into employees_tbl(id, name, dept, salary)"
					+ "values (800, \"Juliet\", \"Sales\", 5500);");
			
			System.out.println("Executed an Insert statement Rows Affected: "+ rowsAffected);		

			List<String> names = select(conn, "name");
			print(names);

			List<String> salaries = select(conn, "salary");
			print(salaries);

			System.out.println("Total salary: " + sum(salaries));

			System.out.println("Preparing to update");
			rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 1000 WHERE id = '600';");
			System.out.println("Executed an Update statement Rows Affected: " + rowsAffected);

			salaries = select(conn, "salary");
			System.out.println("New total salary: " + sum(salaries));

			System.out.println("Preparing to delete");
			rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl WHERE name = 'juliet';");
			System.out.println("Executed an Delete statement Rows Affected: " + rowsAffected);
			names = select(conn, "name");
			print(names);

		} catch (SQLException e) {
			System.out.println("Error executing statement");
		}

	}

	private static <T> Integer sum(List<T> values) {
		Integer total = 0;
		for (T t : values) {
			total += Integer.valueOf((String) t);
		}		
		return total;
	}

	private static void print(List<?> lista) {
		lista.forEach(System.out::println);
	}

	private static List<String> select(Connection conn, String value) {
		List<String> data = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			String query = "select * from employees_tbl;";
			ResultSet resultset = statement.executeQuery(query);

			while (resultset.next()) {
				data.add(resultset.getString(value));
			}
		} catch (SQLException e) {
			System.out.println("Error executing statement");
		}
		return data;
	}
}
