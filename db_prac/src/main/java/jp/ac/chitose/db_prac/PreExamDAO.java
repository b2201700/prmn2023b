package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExamDAO {
    public static final String URL = "jdbc:h2:~/h2db/db_prac;Mode=PostgreSQL;AUTO_SERVER=TRUE";
    public static final String USER_NAME = "b2201700";
    public static final String USER_PASS = "Elf116cotton85";

    public List<PreExam> selectPreExams(int lessThan) throws SQLException {
        List<PreExam> returning = new ArrayList<>();
        String SQL = "select * from 学生情報 where 得点 < ?"; // where:条件式 , ?:プレースホルダー

        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setInt(1,lessThan); // ?をlessThanに
            ResultSet result = stmt.executeQuery(); // データベースから返す
            while(result.next()){
                String col1 = result.getString("学生コード");
                String col2 = "null";
                String col3 = "null";
                int cor4 = result.getInt("得点");
                PreExam preExam = new PreExam(col1, col2, col3, cor4);
                returning.add(preExam);
            }
        }
        return returning;
    }

    // 演習4
    public int deletePreExam(String gakusekiCode) throws SQLException {
        String sql = "delete from 学生情報 where 学生コード = ?"; // TODO
        int n = 0;
        try(Connection conn = DriverManager.getConnection(URL,USER_NAME,USER_PASS);
            PreparedStatement stmt = conn.prepareStatement(sql) ){
            stmt.setString(1,gakusekiCode);
            n = stmt.executeUpdate();
        }
        return n;
    }

    // 演習6
    public int insertPreExam(String gakusekiCode, String familyName, String fistName, int point) throws SQLException{
        String sql = "insert into 学生情報 values (?,?,?,?)"; // TODO
        int n = 0;
        try(Connection conn = DriverManager.getConnection(URL,USER_NAME,USER_PASS);
            PreparedStatement stmt = conn.prepareStatement(sql) ){
            stmt.setString(1,gakusekiCode);
            stmt.setString(2,familyName);
            stmt.setString(3,fistName);
            stmt.setInt(4,point);
            n = stmt.executeUpdate();
        }
        return n;
    }
}
