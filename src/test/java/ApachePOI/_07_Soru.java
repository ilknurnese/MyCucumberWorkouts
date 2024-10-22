package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  Ekrandaki gibi bir Excel Çarpım tablosunu
 *  varolan boş bir excel dosyasına
 *  1 den 10 kadar çarpımlar için yapınız.
 *  (ipucu önce sadece 1 leri yapınız sonra
 *  diğerlerini)
 */
//        1 x 1 = 1
//        1 x 2 = 2
//        1 x 3 = 3
//        1 x 4 = 4
//        1 x 5 = 5
//        1 x 6 = 6
//        1 x 7 = 7
//        1 x 8 = 8
//        1 x 9 = 9
//        1 x 10 = 10

public class _07_Soru {
    public static void main(String[] args) throws IOException {

        //location of the Excel file
        String path="src/test/java/ApachePOI/resources/Carpim.xlsx";

        //open the Excel File
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);

        //open the sheet
        Sheet sheet=workbook.getSheetAt(0);

        // Multiplication Table
        for (int i = 1; i <= 10; i++) {

            // Find the last row
            // Son satırı bul
            int enSonSatir = sheet.getPhysicalNumberOfRows();

            // Yeni satır oluştur (son satırın altına)
            //create a new row
            Row yeniSatir = sheet.createRow(enSonSatir);

            // A sütununa 1 yaz (Çarpılan sabit değer)
            Cell cellA = yeniSatir.createCell(0);
            cellA.setCellValue(1);

            // B sütununa "x" yaz (Çarpma işareti)
            Cell cellB = yeniSatir.createCell(1);
            cellB.setCellValue("x");

            // C sütununa çarpılan sayıyı yaz (1, 2, 3, ...)
            Cell cellC = yeniSatir.createCell(2);
            cellC.setCellValue(i);

            // D sütununa "=" yaz
            Cell cellD = yeniSatir.createCell(3);
            cellD.setCellValue("=");

            // E sütununa sonucu yaz (1 * i)
            Cell cellE = yeniSatir.createCell(4);
            cellE.setCellValue(1 * i);
        }


        inputStream.close();   // close input mode

        // to save the file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);  //save the workbook
        workbook.close();  // clean the memory
        fileOutputStream.close();   //close the save mode

        System.out.println("İşlem tamamlandı");
    }
}
