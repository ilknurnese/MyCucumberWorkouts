package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);

        int enSonSatir=sheet.getPhysicalNumberOfRows();// the last row number
        Row yeniSatir=sheet.createRow(enSonSatir);  // create a new row after the last row
        Cell yeniHucre=yeniSatir.createCell(0); //create a new cell on the new row

        yeniHucre.setCellValue("Merhaba");
        inputStream.close();   // close reading mode

        // to save the file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);  //save the workbook
        workbook.close();  // clean the memory
        fileOutputStream.close();   //close the save mode

        System.out.println("İşlem tamamlandı");

    }
}
