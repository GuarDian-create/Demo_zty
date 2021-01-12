package cn.kgc.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sun.rmi.runtime.NewThreadAction;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoiTest {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("商品信息");
        sheet.setColumnWidth(3,20*256);//给第3列设置为20个字的宽度
        sheet.setColumnWidth(4,20*256);//给第4列设置为20个字的宽度
        //创建一行,下标从0开始
        XSSFRow row = sheet.createRow(0);
        //创建这行中的列,下标从0开始 （表头）
        XSSFCell cell = row.createCell(0);
        // 给cell 0下表赋值
        cell.setCellValue("品牌");
        //创建这行中的列,并给该列直接赋值
        row.createCell(1).setCellValue("型号");
        row.createCell(2).setCellValue("内存");
        row.createCell(3).setCellValue("颜色");
        row.createCell(4).setCellValue("尺寸");
        // 设置表里内容
        row = sheet.createRow(1);
        row.createCell(0).setCellValue("华为");
        row.createCell(1).setCellValue("P40 Pro");
        row.createCell(2).setCellValue("128G");
        row.createCell(3).setCellValue("珍珠白");
        row.createCell(4).setCellValue("6.4英寸");

        row = sheet.createRow(2);
        row.createCell(0).setCellValue("苹果");
        row.createCell(1).setCellValue("I phone XS");
        row.createCell(2).setCellValue("64G");
        row.createCell(3).setCellValue("星空灰");
        row.createCell(4).setCellValue("5.4英寸");

        //设定路径
        File file = new File("D:\\study\\POI\\商品信息.xlsx");
        FileOutputStream stream = new FileOutputStream(file);
        //需要抛出异常
        workbook.write(stream);
        //关流
        stream.close();


    }
}
