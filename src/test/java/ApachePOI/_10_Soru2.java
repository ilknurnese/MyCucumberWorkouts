package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
   Main den bir metod çağırmak suretiyle, path i ve sheetName i verilen excelden
   istenilen sütun kadar veriyi okuyup bir List e atınız. Mainde Listi yazdırınız.
   Bu soruda kaynak Excel için : ApacheExcel2.xlsx in 2.sheet ini kullanabilirsiniz.
 */
public class _10_Soru2 {

    public static void main(String[] args) throws IOException {

        // Kullanıcıdan gelen bilgiler (path, sheetName, istenenKolonSayisi)
        String path = "src/test/java/ApachePOI/resources/ApacheExcel2.xlsx";  // Excel dosya yolu
        String sheetName = "testCitizen";  // Sayfa adı
        int istenenKolonSayisi = 3;  // İstenilen sütun sayısı

        // getData metodunu çağır ve dönen listeyi al
        ArrayList<ArrayList<String>> gelenData = getData(path, sheetName, istenenKolonSayisi);

        // List'i yazdır
        for (ArrayList<String> row : gelenData) {
            for (String cell: row)
                System.out.println(cell+" ");
            System.out.println(row);
        }
    }

    // getData metodu: Excel'den belirtilen sütun sayısı kadar veriyi okuyup bir List'e döner
    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int istenenKolonSayisi) throws IOException {

        // Tüm verilerin tutulacağı liste
        ArrayList<ArrayList<String>> allData = new ArrayList<>();

        Sheet sheet =null;
        try{
            FileInputStream inputStream = new FileInputStream(path);
             Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satir=new ArrayList<>();
            for (int j = 0; j < istenenKolonSayisi; j++) {
                satir.add(sheet.getRow(i).getCell(j).toString());
            }
            allData.add(satir);
        }
        return allData;
    }
}
