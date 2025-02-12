import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        import package
        load and register
        create connection
        create statement
        execute the statement
        process the results
        close
         */

        String url = "jdbc:mysql://localhost:3306/staff";
        String username = "root";
        String password = "Saiyashu@1234";


        //Read Operation
        //String sql = "SELECT * FROM EmployeeData";
        //Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery(sql);

        //Insert Operation
        //String sql = "INSERT INTO EmployeeData VALUES(7, "Jack", "Sales", "M", 39);
        //boolean status = st.execute(sql);Instead of execute query, we use execute command to insert the elements
        //System.out.println(status);

        //Update Operation
        //String sql = UPDATE EmployeeData SET Name = "Max" WHERE EmployeeId = 6;
        //st.execute(sql);

        //Delete Operation
        //String sql = DELETE FROM EmployeeData WHERE EmployeeId = 6;
        //st.execute(sql)


        //Class.forName("org.mysql.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established");

        String sql = "SELECT * FROM EmployeeData";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.print(rs.getString(3) + " - ");
            System.out.print(rs.getString(4) + " - ");
            System.out.println(rs.getInt(5));
        }
        con.close();
        System.out.println("Connection Closed");

    }
}
