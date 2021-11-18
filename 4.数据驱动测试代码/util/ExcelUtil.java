package util;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {
    public static Object[][] getTestData(String filename, String sheetName)throws IOException {
        File file = new File(filename);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        // 获取文件拓展名
        String fileExtensionName = filename.substring(filename.indexOf("."));
        if(fileExtensionName.equals(".xlsx")){
            workbook = new XSSFWorkbook(inputStream);
        }
        else if(fileExtensionName.equals(".xls")){
            workbook = new HSSFWorkbook(inputStream);
        }

        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();  //获取总行数
        List<Object[]> records = new ArrayList<Object[]>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Cell cell;
        for (int i = 0; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            String fields[] = new String[row.getLastCellNum()];
            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if(cell != null){
                    //如果是数字类型
                    if(cell.getCellType()==CellType.NUMERIC){
                        //判断是不是日期格式
                        if(DateUtil.isCellDateFormatted(cell)){
                            fields[j] = simpleDateFormat.format(cell.getDateCellValue());
                        }
                    }
                    //如果是字符串类型
                    if(cell.getCellType()==CellType.STRING){
                        row.getCell(j).setCellType(CellType.STRING);
                        fields[j] = row.getCell(j).getStringCellValue();
                    }

                }
            }
            records.add(fields);
        }

        Object[][] results = new Object[records.size()][];
        for (int i = 0; i < records.size(); i++) {
            results[i] = records.get(i);
        }
        return results;
    }
}
