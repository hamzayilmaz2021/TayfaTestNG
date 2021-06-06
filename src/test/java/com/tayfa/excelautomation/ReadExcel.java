package com.tayfa.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu = "src/test/resources/veriler.xlsx";
        FileInputStream file = new FileInputStream(dosyaYolu);

        // Workbook (excel) dosyasını okuyalım
        Workbook excel = WorkbookFactory.create(file);

        // Sheet seçimi
        Sheet sheet     = excel.getSheetAt(0);

        // Satırlar
        Row birinciSatir = sheet.getRow(0);

        // Hücreler
        Cell isim  = birinciSatir.getCell(0);
        Cell sayi  = birinciSatir.getCell(1);
        Cell kategori  = birinciSatir.getCell(2);

        System.out.println(isim.toString());
        System.out.println(sayi.toString());
        System.out.println(kategori.toString());
/*
        // Kulaklık Satırı
        Row ikinciSatir = sheet.getRow(1);

        // Kategori hücresi
        Cell kulaklikKategori = ikinciSatir.getCell(2);
*/

        Cell kulaklikKategori = sheet.getRow(1).getCell(2);
        System.out.println(kulaklikKategori.toString());

        // Son satır indexini alma
        int sonSatir = sheet.getLastRowNum();
        System.out.println(sonSatir);

        // İçerisinde data olan satır sayısı
        int satirSayisi = sheet.getPhysicalNumberOfRows();
        System.out.println(satirSayisi);

        /*for(int i = 0; i <= sonSatir ; i++){
            Cell data = sheet.getRow(i).getCell(2);
            System.out.println(data.toString());
        }*/

        for(Row row : sheet){
            System.out.println(row.getCell(2).toString());
        }

        // Sütun sayısını alma
        int sutunSayisi = sheet.getRow(2).getLastCellNum();
        System.out.println(sutunSayisi);

        /*for(int k = 0 ; k < sutunSayisi ; k++){
            Cell data = sheet.getRow(2).getCell(k);
            System.out.println(data.toString());
        }*/

        for(Cell cell : sheet.getRow(2)){
            System.out.println(cell.toString());
        }


        excel.close();
        file.close();

    }


}
