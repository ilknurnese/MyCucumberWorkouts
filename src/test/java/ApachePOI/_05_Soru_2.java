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

public class _05_Soru_2 {
    public static void main(String[] args) throws IOException {

        //istenen anahtar kelimeyi kullanıcıdan al
        // Scanner ile kullanıcıdan anahtar kelimeyi alıyoruz
        Scanner oku = new Scanner(System.in);
        System.out.print("Aramak istediğiniz anahtar kelimeyi girin: ");
        String arananKelime = oku.nextLine();

        // Excel dosyasının yolunu belirtiyoruz
        String path = "src/test/java/ApachePOI/resources/LoginData.xlsx";

        // Anahtar kelimeyi arayıp sonucun döndürülmesi için metodu çağırıyoruz
        String donenData = ExceldenGetir(arananKelime,path);
        System.out.println("donenData = " + donenData);

    }

    // Verilen kelimeyi 1. sütunda arayıp, karşılık gelen değeri döndürüyoruz
    public static String ExceldenGetir(String arananKelime, String path) throws IOException {

        String donecekData="";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if(sheet.getRow(i).getCell(0).toString().equals(arananKelime))
            {
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells();j++) {
                    donecekData=donecekData+" " +sheet.getRow(i).getCell(j);
                }

            }
        }

        return donecekData;
    }


}
