package dbms_1.SQL;

import java.sql.ResultSet;

public interface BaseConnect {
    public void connect(String url, String user, String pass);
    public ResultSet execSQL(String sql, String[] params);
}
