package pages;

import com.google.inject.Inject;
import configs.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Support;

import java.util.HashMap;

public class Rx2u {

    WebDriver dr;

    @Inject
    ConfigReader cr;

    @Inject
    Support sp;

    @Inject
    About about;

    @FindBy(id = "logo")
    private WebElement logo;

    @FindBy(xpath = "//a[@routerlink='/rxpickup']")
    private WebElement rxpickup;


    @Inject
    public Rx2u(WebDriver dr){
        PageFactory.initElements(this.dr=dr,this);
    }

    public void goToHomepage(){
        String url = cr.getRx2uUrl();
        System.out.println("URL: "+ url);
        dr.get(url);
        sp.waitFor(5);
    }

    public void validateLogo(String logoTxt){
        sp.validateText(logoTxt,logo.getText());
    }

    public void validateAbout(){
       about.validateAbout();
     //  about.validateAboutSections();
    }

    //for dynamic accessing elements
    public WebElement getElement(String key){
        HashMap<String,WebElement> hm = new HashMap<>();
        hm.put("logo",logo);
        hm.put("rxpickup",rxpickup);
        return hm.get(key);
    }

}
