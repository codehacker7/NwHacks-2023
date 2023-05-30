import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HTMLSource {


        public String getHTMLcode(String websiteurl) {

            URL url;
            String inputLine = "";

            try {
                // get URL content

//                String a="https://en.wikipedia.org/wiki/List_of_richest_people_in_the_world";
                url = new URL(websiteurl);
                URLConnection conn = url.openConnection();

                // open the stream and put it into BufferedReader
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));

                String currLine;
                while ((currLine = br.readLine()) != null) {
                    inputLine += (currLine + "\n");
                }
                System.out.println(inputLine);
                br.close();

                System.out.println("Done");

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inputLine;

        }

}

