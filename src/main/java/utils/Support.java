package utils;

import com.google.inject.Inject;
import configs.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Support {

    @Inject
    ConfigReader cr;

    @Inject
    WebDriver dr;

    public void deleteAllCookies(){
        dr.manage().deleteAllCookies();
    }

    public void maximizeWindow(){
        if(cr.getWinMax()){
            dr.manage().window().maximize();
        }
    }

    public void setWaitTime(){
        dr.manage().timeouts().implicitlyWait(cr.getWait(), TimeUnit.SECONDS) ;
    }

    public void waitFor(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validateText(String expected,String actual){
        System.out.println("EXPECTED: "+ expected +" | ACTUAL: "+ actual);
        assertEquals(expected,actual);
    }

    public void quit(){
        Thread CLOSE_THREAD = new Thread(()->dr.quit());
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }
}

