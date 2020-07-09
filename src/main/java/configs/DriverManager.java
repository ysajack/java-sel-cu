package configs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    WebDriver dr;

    public DriverManager(){
        setBrowser();
    }

    public void setBrowser(){
        ConfigReader cr = new ConfigReader();
        String browser = cr.getBrowser();
        System.out.println("BROWSWER: "+ browser);
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                dr = new ChromeDriver();
                break;
            case "firefox":
                //  FirefoxDriverManager.getInstance().setup();
                dr = new FirefoxDriver();
                break;
        }
    }

    public WebDriver getDriver(){
        return dr;
    }

    public void quit(){
        dr.quit();
    }

}
