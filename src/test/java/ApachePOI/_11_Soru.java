package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.
 */
public class _11_Soru {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/TestSonuclari.xlsx";  // Dosya yolu
        String testSonuc = "Test Passed";  // Yazılacak veri

        // Excel'e yazma işlemleri
        writeToExcel(path, testSonuc); // Excel'i oluştur ve veri yaz
        writeToExcel(path, testSonuc); // Veriyi ekle
        writeToExcel(path, testSonuc); // Veriyi ekle
        writeToExcel(path, testSonuc); // Veriyi ekle
        writeToExcel(path, testSonuc); // Veriyi ekle
    }

    // Excel'e yazı yazan metot
    public static void writeToExcel(String path, String testSonuc) throws IOException {

        File file = new File(path);
        Workbook workbook;
        Sheet sheet;

        // Eğer dosya yoksa yeni bir workbook ve sheet oluştur
        if (!file.exists()) {
            workbook = new XSSFWorkbook();  // Yeni bir Excel dosyası oluştur
            sheet = workbook.createSheet("Test Results");  // Yeni bir sayfa oluştur
        } else {
            // Dosya varsa aç ve workbook'u yükle
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);  // İlk sayfayı al
            inputStream.close();
        }

        // Son satırın altına yeni bir satır ekle
        int lastRowNum = sheet.getLastRowNum();
        Row newRow = sheet.createRow(lastRowNum + 1);  // Yeni satır oluştur
        newRow.createCell(0).setCellValue(testSonuc);  // İlk hücreye "Test Passed" yaz

        // Değişiklikleri dosyaya yaz
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();  // Workbook'u kapat
        outputStream.close();  // Dosyayı kapat
    }
}
