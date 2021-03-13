package dbms_1.SQL;

import java.sql.*;

public class PostgreSQL implements BaseConnect {

    private Connection con = null;
    private ResultSet rs = null;
    private Statement stmt = null;

    static String url = "jdbc:postgresql://localhost:5432/postgres";
    static String user = "postgres";
    static String pass = "123";

    public PostgreSQL(){
        connect(PostgreSQL.url, PostgreSQL.user, PostgreSQL.pass);
    }

    @Override
    public void connect(String url, String user, String pass) {
        try {

            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successful!");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    @Override
    public ResultSet selectSQL(String sql, String[] params) {
        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (SQLException throwables) {

            throwables.printStackTrace();

        }

        return rs;
    }

    @Override
    public int updateSQL(String sql, String[] params) {

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
