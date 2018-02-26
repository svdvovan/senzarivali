import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class senza_losiny {
    public static void main(String[] args) throws IOException {
        System.setProperty("javax.net.ssl.trustStore", "d:/senzarivali.crt.jks");
        String Path = "https://www.senzarivali.ru/catalog/legginsy/";

        Document doc1 = Jsoup.connect(Path).get();
        Elements lHref = doc1.select("a.d_block");
        Elements links1 = doc1.getElementsByClass("dark_link");

        Elements prices = doc1.getElementsByClass("current_price got_bold pink");
        Elements Names = doc1.select("a[data-product]");




       int y = 0;
        for (Element link1 : links1) {
            System.out.println(  link1.text() + " ; " );
//            String addressUrl = lHref.get(y).attr("abs:href");
//            Document doc2 = Jsoup.connect(addressUrl).get();
y++;
        }

   }
}
