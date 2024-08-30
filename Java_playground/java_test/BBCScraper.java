import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BBCScraper {
    public static void main(String[] args) {
        String url = "https://www.bbc.com/news";
        
        try {
            // Fetch the HTML from the BBC News website
            Document doc = Jsoup.connect(url).get();

            // Select elements that match the article titles and links
            Elements articles = doc.select("a.gs-c-promo-heading");

            // Loop through each article and print the title and link
            for (Element article : articles) {
                String title = article.text();
                String link = article.absUrl("href");

                System.out.println("Title: " + title);
                System.out.println("Link: " + link);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
