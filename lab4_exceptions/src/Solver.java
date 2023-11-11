import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Solver {
    private static final String appID = System.getenv("WOLFRAM_APP_ID");

    static String Solve(String query) throws IOException {

        String urlRaw = "http://api.wolframalpha.com/v1/result?appid=%s&i=%s".formatted(appID, URLEncoder.encode(query));

        URL url = new URL(urlRaw);
        InputStream is = url.openStream();

        String str = new String(is.readAllBytes());
        return str;
    }
}
