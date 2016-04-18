//import org.jsoup.examples.ParallelParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.BufferedReader;
import java.io.FileReader;		

public class testing 
{
	public static void main(String[] args) throws Exception
	{
		
        FileReader file = new FileReader("/Users/liu/Java_test/PageParser/testcase/26.html");
        BufferedReader reader = new BufferedReader(file);
        				
        String html = "";
        String line = reader.readLine();
        while(line!=null)
        {
        	html += line;
        	line = reader.readLine();
        }
          long startTime = System.currentTimeMillis();
          //Parse HTML by Jsoup
          Document doc = Jsoup.parse(html);

          System.out.println(doc);
          long endTime = System.currentTimeMillis();
          
          long totalTime = endTime - startTime;
          System.out.println(totalTime+ " ms");
    }
}
