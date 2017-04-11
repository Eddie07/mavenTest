package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by User on 06.04.2017.
 */
public class PropertiesReader {

public String getProperty(String path) throws IOException {
    Properties pro=new Properties();
    InputStream in=new FileInputStream(path);
    pro.load (in);
    return pro.getProperty(pro.load);
}
}
