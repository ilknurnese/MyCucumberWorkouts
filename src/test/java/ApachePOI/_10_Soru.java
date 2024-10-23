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
public class _10_Soru {

    public static void main(String[] args) throws IOException {

        // Kullanıcıdan gelen bilgiler (path, sheetName, istenenKolonSayisi)
        String path = "src/test/java/ApachePOI/resources/ApacheExcel2.xlsx";  // Excel dosya yolu
        String sheetName = "testCitizen";  // Sayfa adı
        int istenenKolonSayisi = 3;  // İstenilen sütun sayısı

        // getData metodunu çağır ve dönen listeyi al
        ArrayList<List<String>> gelenData = getData(path, sheetName, istenenKolonSayisi);

        // List'i yazdır
        for (List<String> row : gelenData) {
            System.out.println(row);
        }
    }

    // getData metodu: Excel'den belirtilen sütun sayısı kadar veriyi okuyup bir List'e döner
    public static ArrayList<List<String>> getData(String path, String sheetName, int istenenKolonSayisi) throws IOException {

        // Tüm verilerin tutulacağı liste
        ArrayList<List<String>> allData = new ArrayList<>();

        try (FileInputStream inputStream = new FileInputStream(path);
             Workbook workbook = WorkbookFactory.create(inputStream)) {

            // İlgili sheet'e ulaş
            Sheet sheet = workbook.getSheet(sheetName);

            // Satırları gezerek istenen kolon kadar veri al
            for (Row row : sheet) {
                ArrayList<String> rowData = new ArrayList<>();

                // Her satırda belirtilen sayıda kolon verisini oku
                for (int i = 0; i < istenenKolonSayisi; i++) {
                    // Eğer hücre boşsa null kontrolü yap
                    if (row.getCell(i) != null) {
                        rowData.add(row.getCell(i).toString());
                    } else {
                        rowData.add("");  // Eğer hücre boşsa boş bir string ekle
                    }
                }

                // Satırın verisini allData'ya ekle
                allData.add(rowData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return allData;
    }
}
