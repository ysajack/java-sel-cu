package configs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    protected final String PROPERTY_FILE_PATH = "src/main/resources/config.properties";
    protected Properties properties;

    String env;
    String browser;
    String winMax;
    String driverPath;
    int wait;

    public ConfigReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(PROPERTY_FILE_PATH));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Config.properties not found at " + PROPERTY_FILE_PATH);
        }

    }

    public String getEnv() {
        return properties.getProperty("env");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getRx2uUrl() {
        return properties.getProperty("rx2u_url");
    }

    public boolean getWinMax() {
        return properties.getProperty("winMax").equals("true");
    }

    public int getWait() {
        return Integer.parseInt(properties.getProperty("wait"));
    }

}

