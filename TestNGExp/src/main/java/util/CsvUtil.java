package util;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {
    public static Object[][] getTestData(String filename)throws IOException{
        List<Object[]> records = new ArrayList<Object[]>();
        BufferedReader file = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename),"UTF-8"));
// file.readLine(); //忽略第一行
// 遍历表中的每一行
        String record; //每一行数据
        while((record = file.readLine()) != null){
            System.out.println(record);
            String fields[] = record.split(",");//csv文件的数据均以','分隔，以此为分隔，存到数组
            records.add(fields);
        }
        file.close();
        Object[][] results = new Object[records.size()][];
        for (int i = 0; i < records.size(); i++) {
            results[i] = records.get(i);
        }
        return results;
    }
}
