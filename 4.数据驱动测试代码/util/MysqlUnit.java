package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MysqlUnit {
    public static Object[][] getTestData(String tableName)throws IOException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/dataProvider?serverTimezone=GMT&&useSSL=false";
        String user = "root";
        String password = "root";
        List<Object[]> records = new ArrayList<Object[]>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            if(!conn.isClosed())
                System.out.println("数据库连接成功");
            Statement statement = conn.createStatement();
            String sql = "select * from "+ tableName;
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int cols = resultSetMetaData.getColumnCount();
            while(rs.next()){
                String fields[] = new String[cols];
                int col = 0;
                for (int colIdx = 0; colIdx < cols; colIdx++) {
                    fields[col] = rs.getString(colIdx+1);
                    col++;
                }
                records.add(fields);
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            rs.close();
            conn.close();
        }catch (ClassNotFoundException e){
            System.out.println("未能找到驱动的类");
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        Object[][] results = new Object[records.size()][];
        for (int i = 0; i < records.size(); i++) {
            results[i] = records.get(i);
        }
        return results;
    }
}
