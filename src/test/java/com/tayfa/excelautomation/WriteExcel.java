package com.tayfa.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void test() throws IOException {
        String dosyaYolu = "src/test/resources/veriler.xlsx";
        FileInputStream file = new FileInputStream(dosyaYolu);

        // Workbook (excel) dosyasını okuyalım
        Workbook excel = WorkbookFactory.create(file);

        FileOutputStream fileOutputStream = new FileOutputStream(dosyaYolu);

        // Sheet seçimi
        Sheet sheet     = excel.getSheetAt(0);

        // Yeni bir hücre oluşturma ve içerisine data ekleme
        sheet.getRow(0).createCell(3).setCellValue("Yorum");
        sheet.getRow(1).createCell(3).setCellValue("50");
        sheet.getRow(2).createCell(3).setCellValue("100");
        //sheet.getRow(3).createCell(3).setCellValue("5");

        // Satır silmek için
        Row silinecekSatir = sheet.getRow(3);
        sheet.removeRow(silinecekSatir);

        // Hücre silmek için
        Cell silinecekHucre = sheet.getRow(0).getCell(0);
        sheet.getRow(0).removeCell(silinecekHucre);


        excel.write(fileOutputStream);
        excel.close();
        file.close();
    }

}
