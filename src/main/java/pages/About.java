package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Reader;
import utils.Support;

public class About {

    WebDriver dr;

    @Inject
    Support sp;

    @Inject
    Reader reader;

    @FindBy(xpath = "//a[@routerlink='/about']")
    private WebElement about;

    @FindBy(xpath = "//*[@class='list'][1]")
    private WebElement appBuilt_text;

    @FindBy(xpath = "//*[@class='list'][2]")
    private WebElement techniques_text;

    @FindBy(xpath = "//*[text()='Application:']//following::p[1]")
    private WebElement application_text;

    @Inject
    public About(WebDriver dr) {
        PageFactory.initElements(this.dr=dr,this);
    }

    //value from text file
    public void validateAbout(){
        about.click();
        sp.maximizeWindow();
        sp.waitFor(3);
        sp.validateText(reader.getAboutSectionText("appBuilt"),appBuilt_text.getText());
        sp.validateText(reader.getAboutSectionText("techniques"),techniques_text.getText());
        sp.validateText(reader.getAboutSectionText("application").trim(),application_text.getText().trim());
    }

    //value from json file
    public void validateAboutSections(){
        about.click();
        sp.maximizeWindow();
        sp.waitFor(3);
        sp.validateText(reader.getTextFor("appBuilt").trim(),appBuilt_text.getText().trim());
        sp.validateText(reader.getTextFor("techniques").trim(),techniques_text.getText().trim());
        sp.validateText(reader.getTextFor("application").trim(),application_text.getText().trim());
    }
}
