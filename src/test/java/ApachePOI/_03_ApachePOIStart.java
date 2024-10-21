package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

//workbook - sheet - row - cell
public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {


        String path="src/test/java/ApachePOI/resources/ApacheExcel2.xlsx";

        //Java dosya işlemcisi üzerinden çalışma kitabını alıyorum
        //hafızada (RAM de) workbook u alıp oluşturdu
        FileInputStream dosyaOkumaBaglantisi= new FileInputStream(path);

        //Dosya okuma istemcii üzerinde
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");

        //istenen satırı al
        Row satir=calismaSayfasi.getRow(0);  ///0.satır

        //sütundaki hücreyi alıyorum
        Cell hucre=satir.getCell(0);

        System.out.println("Hucre " + hucre);




    }
}
