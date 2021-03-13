package dbms_1.SQL;

import java.sql.*;

public class MySQL implements BaseConnect {
    static String url = "jdbc:mysql://localhost:3306/javaproject";
    static String user = "root";
    static String pass = "root";
    private Connection con;
    private ResultSet rs = null;
    private Statement stmt = null;

    @Override
    public Connection getConnection(){
        return this.con;
    }

    public MySQL(){
        connect();
    }

    @Override
    public void connect() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public ResultSet selectSQL(String sql) {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }

    @Override
    public int updateSQL(String sql) {

        int rows = 0;
        try {

            stmt = con.createStatement();

        } catch (SQLException throwables) {

            throwables.printStackTrace();

        }

        return rows;

    }

    @Override
    public void closeConn() {
        try {

            if (con != null)
                con.close();

            if (stmt != null)
                stmt.close();

            if (rs != null)
                rs.close();

        } catch (SQLException throwables) {

            throwables.printStackTrace();

        }
    }
}
