import java.sql.*;
import javax.sql.*;

public class pgm10_connect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jprog10db?useSSL=false";
        String username = "root";
        String password = "root";
        Statement stmt;
        ResultSet rs;

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database successfully!");
            stmt = con.createStatement();
            System.out.println("Creating table");

            String query_customer = "CREATE TABLE CUSTOMER " +
                    "(cid INTEGER PRIMARY KEY, " +
                    "name VARCHAR (100), " +
                    "dob DATE, " +
                    "address VARCHAR(255))";

            stmt.executeUpdate(query_customer);
            System.out.println("Table is created...");
            System.out.println("Inserting records into the table...");

            String insertRow1 =
                    "INSERT INTO customer (cid, name, dob, address) " +
                    "VALUES ('101', 'Neeta', '1999-08-20', 'Koramangala')";
            stmt.executeUpdate(insertRow1);
            System.out.println("Row is inserted");

            String insertRow2 =
                    "INSERT INTO customer (cid, name, dob, address) " +
                    "VALUES ('102', 'Vinodhini', '1999-08-20', 'Indira Nagar')";
            stmt.executeUpdate(insertRow2);
            System.out.println("Row is inserted");

            rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
            System.out.println("Displaying records");

            while (rs.next()) {
                System.out.print("Id: " + rs.getInt("cid"));
                System.out.print(" Name: " + rs.getString("name"));
                System.out.print(" DOB: " + rs.getDate("dob"));
                System.out.println(" Address: " + rs.getString("address"));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}