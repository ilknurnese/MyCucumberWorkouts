package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {



        //There is no Excel file
        //create a workbook
        XSSFWorkbook workbook=new XSSFWorkbook(); // hafızadaki workbook
        XSSFSheet sheet=workbook.createSheet("Sayfa1");

        Row yeniSatir=sheet.createRow(0);
        Cell yeniHucre=yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dünya");

        String path="src/test/java/ApachePOI/resources/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("işlem tamamlandı");

    }
}
