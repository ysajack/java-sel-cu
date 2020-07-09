package hooks;

import com.google.inject.Inject;
import configs.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Support;

public class Hooks{

    @Inject
    WebDriver driver;

    @Inject
    Support sp;

    @Before
    public void openBrowser() {
 //       sp.deleteAllCookies();
   //   driver = driverManager.getDriver();
   //     System.out.println("DRIVER: " + driver);
//		sp.maximizeWindow();
        //sp.setWaitTime();
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        /**
         * Embed a screenshot in test report if test is marked as failed
         */
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
      //  sp.deleteAllCookies();
  //      driver.quit();

        sp.quit();

    }
}
