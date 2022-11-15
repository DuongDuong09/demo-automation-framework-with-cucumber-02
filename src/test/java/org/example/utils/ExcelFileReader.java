package org.example.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

import java.util.*;

public class ExcelFileReader {

    private static FileInputStream fis;
    private FileOutputStream fileOut;
    private  XSSFWorkbook wb=new XSSFWorkbook();
    private static Sheet sh;
    private static Cell cell;
    private Row row;
    private CellStyle cellstyle;
    private Color mycolor;
    private static String excelPath="src/test/resources/datatest_deposit.xlsx";
    private static String sheetName="Sheet1";
    private static Map<String, Integer> columns = new HashMap<>();

//    public static void setExcelFile() throws Exception {
//        try {
//            File f = new File(excelPath);
//
//            if (!f.exists()) {
//                f.createNewFile();
//                System.out.println("File doesn't exist, so created!");
//            }
//
//            fis = new FileInputStream(excelPath);
//            wb = WorkbookFactory.create(fis);
//            sh = wb.getSheet(sheetName);
//            //sh = wb.getSheetAt(0); //0 - index of 1st sheet
//            if (sh == null) {
//                sh = wb.createSheet(sheetName);
//            }
//
//            //adding all the column header names to the map 'columns'
//            sh.getRow(0).forEach(cell ->{
//                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
//            });
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static String getCellData( String columnName,int rownum) throws Exception{
//        setExcelFile();
//        try{
//            cell = sh.getRow(rownum).getCell(columns.get(columnName));
//            String CellData = null;
//            switch (cell.getCellType()){
//                case STRING:
//                    CellData = cell.getStringCellValue();
//                    break;
//                case NUMERIC:
//                    if (DateUtil.isCellDateFormatted(cell))
//                    {
//                        CellData = String.valueOf(cell.getDateCellValue());
//                    }
//                    else
//                    {
//                        CellData = String.valueOf((long)cell.getNumericCellValue());
//                    }
//                    break;
//                case BOOLEAN:
//                    CellData = Boolean.toString(cell.getBooleanCellValue());
//                    break;
//                case BLANK:
//                    CellData = "";
//                    break;
//            }
//            return CellData;
//        }catch (Exception e){
//            return"";
//        }
//    }
//
////    public static String getCellData(String columnName, int rownum) throws Exception {
////        return getCellData(rownum, columns.get(columnName));
////    }
//
//    public void setCellData(String text, int rownum, int colnum) throws Exception {
//        try{
//            row  = sh.getRow(rownum);
//            if(row ==null)
//            {
//                row = sh.createRow(rownum);
//            }
//            cell = row.getCell(colnum);
//
//            if (cell == null) {
//                cell = row.createCell(colnum);
//            }
//            cell.setCellValue(text);
//
//            fileOut = new FileOutputStream(excelPath);
//            wb.write(fileOut);
//            fileOut.flush();
//            fileOut.close();
//        }catch(Exception e){
//            throw (e);
//        }
//    }
    public static String excelReader(String columnName,int rowNum ) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File(excelPath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        try {
//    Iterator<Row> iterator = firstSheet.iterator();
//
//        while (iterator.hasNext()) {
//        Row nextRow = iterator.next();
//        Iterator<Cell> cellIterator = nextRow.cellIterator();
//
////        while (cellIterator.hasNext()) {
//            Cell cell = cellIterator.next();
            Cell cell = firstSheet.getRow(rowNum).getCell(columns.get(columnName));
            String CellData = null;
            switch (cell.getCellType()) {
                case STRING:
                    CellData = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        CellData = String.valueOf(cell.getDateCellValue());
                    } else {
                        CellData = String.valueOf((long) cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    CellData = Boolean.toString(cell.getBooleanCellValue());
                    break;
                case BLANK:
                    CellData = "";
                    break;
            }
            return CellData;
        }catch (Exception e)
        {
    }

        workbook.close();
        inputStream.close();
        return null;
    }

}
