import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        URL url2 = new URL("http://www-db.deis.unibo.it/courses/TW/DOCS/w3schools/xml/note.xml");
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        Geo geo = new Geo();
        saxParser.parse(new InputSource(url2.openStream()), geo);
    }
}
