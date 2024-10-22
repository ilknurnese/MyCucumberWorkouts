package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Soru_2 {
    public static void main(String[] args) throws IOException {


        //location of the Excel file
        String path="src/test/java/ApachePOI/resources/Carpim.xlsx";

        //open the Excel File
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);
,
        int enSonSatir =0; //= sheet.getPhysicalNumberOfRows();


        for (int i = 1; i <= 10; i++) {

            Row yeniSatir = sheet.createRow(enSonSatir);

            Cell hucre1=yeniSatir.createCell(0); hucre1.setCellValue(1);
            Cell hucre2=yeniSatir.createCell(1); hucre1.setCellValue("*");
            Cell hucre3=yeniSatir.createCell(2); hucre1.setCellValue(i);
            Cell hucre4=yeniSatir.createCell(3); hucre1.setCellValue("=");
            Cell hucre5=yeniSatir.createCell(4); hucre1.setCellValue(1*i);


        }


        inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("işlem tamamlandı");

    }
}
