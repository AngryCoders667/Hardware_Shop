package dbms_1.SQL;

import java.sql.ResultSet;

public interface BaseConnect {
    public void connect(String url, String user, String pass);
    public ResultSet selectSQL(String sql, String[] params);
    public int updateSQL(String sql, String[] params);
    public void closeConn();
}
