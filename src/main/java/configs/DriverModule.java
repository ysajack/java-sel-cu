package configs;

import com.google.inject.*;
import org.openqa.selenium.WebDriver;

public class DriverModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(WebDriver.class).toInstance(new DriverManager().getDriver());//It's a singlton across automatically
    }
}
