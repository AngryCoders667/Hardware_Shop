package dbms_1.SQL;

import java.sql.Connection;
import java.sql.ResultSet;

public interface BaseConnect {
    public void connect();
    public ResultSet selectSQL(String sql);
    public int updateSQL(String sql);
    public void closeConn();
    public Connection getConnection();

}
