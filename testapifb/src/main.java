import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        URL url = new URL("https://www.facebook.com/CEO.Truongjae");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(line);
            }
        }
        String data = result.toString();

        int index = data.indexOf("entity_id")+12;
        String UID="";
        for(int i = index;i<data.length();i++){
            if(data.charAt(i) == '"')
                break;
            UID+=data.charAt(i);
        }
        System.out.println(UID);
    }
}
