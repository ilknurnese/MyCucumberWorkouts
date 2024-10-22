package ApachePOI;


import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**

 Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 bulup ve sonucun döndürülmesi için metod kullanınız.
 src/test/java/ApachePOI/resources/LoginData.xlsx*/

public class _05_Soru {
    public static void main(String[] args) throws IOException {

        //istenen anahtar kelimeyi kullanıcıdan al
        // Scanner ile kullanıcıdan anahtar kelimeyi alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aramak istediğiniz anahtar kelimeyi girin: ");
        String anahtarKelime = scanner.nextLine();


        // Excel dosyasının yolunu belirtiyoruz
        String path = "src/test/java/ApachePOI/resources/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Anahtar kelimeyi arayıp sonucun döndürülmesi için metodu çağırıyoruz
        String sonuc = arananDeger(anahtarKelime, sheet);
        System.out.println(sonuc);

        // Kaynakları kapatıyoruz
        workbook.close();
        inputStream.close();
        scanner.close();

    }

    // Verilen kelimeyi 1. sütunda arayıp, karşılık gelen değeri döndürüyoruz
    public static String arananDeger(String anahtarKelime, Sheet sheet) {
        int rowCount = sheet.getPhysicalNumberOfRows(); // Toplam satır sayısını alıyoruz

        // Satırları dolaşıyoruz
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0); // İlk sütundaki hücreyi alıyoruz

            if (cell.getStringCellValue().equalsIgnoreCase(anahtarKelime)) {
                // Eğer hücredeki değer anahtar kelimeye eşitse, bu satırın B sütunundaki değerini döndürüyoruz
                Cell degerHucresi = row.getCell(1); // İkinci sütundaki hücreyi alıyoruz (B sütunu)
                return degerHucresi.toString(); // B sütunundaki değeri döndürüyoruz
            }
        }
        return "Aranan kelime bulunamadı"; // Eğer kelime bulunamazsa bu mesajı döndürüyoruz
    }


}
