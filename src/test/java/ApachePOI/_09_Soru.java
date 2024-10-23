package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class _09_Soru {
    public static void main(String[] args) throws IOException {

// YeniExcel2.xlsx adında bir yeni excele merhaba Dünya 1 şeklinde yazı yazınız.
// Daha sonra program her yeniden çalıştırıldığında altına Merhaba Dünya 2...3
// şeklinde eklesin. Yani dosya yok ise oluşturup yazsın, daha sonra hep altına eklesin.

// File dosya=new File(path)
// if ( dosya.exists() )    dosya var ise

// Merhaba Dünya 1
// Merhaba Dünya 2
// Merhaba Dünya 3
// ...

       //String path="";
        String path="src/test/java/ApachePOI/resources/YeniExcel2.xlsx";

        File dosya=new File(path);

        XSSFWorkbook workbook;
        XSSFSheet sheet;

        if(dosya.exists()){

             FileInputStream inputStream=new FileInputStream(path);
             workbook=new XSSFWorkbook(inputStream);
             sheet=workbook.getSheetAt(0);
             inputStream.close();

        } else {

             workbook=new XSSFWorkbook();
             sheet=workbook.createSheet("Sayfa1");

        }

        int enSonSatir=sheet.getPhysicalNumberOfRows();

        Row yeniSatir=sheet.createRow(enSonSatir);
        Cell yeniHucre=yeniSatir.createCell(0);

        yeniHucre.setCellValue("Merhaba Dünya " + (enSonSatir+1));

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("işlem tamamlandı");


    }
}
