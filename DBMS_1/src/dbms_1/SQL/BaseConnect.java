package dbms_1.SQL;

import java.sql.ResultSet;

public interface BaseConnect {
    public void connect(String url, String user, String pass);
    public ResultSet selectSQL(String sql);
    public int updateSQL(String sql);
    public void closeConn();
}
