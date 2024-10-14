import static org.junit.Assert.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;

public class MyHtmlTest {

    @Test
    public void testHomePageAvailability() throws IOException {
        String siteUrl = "http://localhost/index.html";  // Change to your website URL
        URL url = new URL(siteUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        // Test if the site is reachable (200 OK response)
        assertEquals(200, responseCode);
    }
}