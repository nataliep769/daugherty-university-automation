package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IMDBResultsPage {

    @FindBy(css = ".findSection")
    public List<WebElement> foundSections;

    @FindBy(css = ".title-section")
    public WebElement title;


    public IMDBResultsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public List<WebElement> getMovieTitles() {
        return foundSections.get(0).findElements(By.className("result_text"));
    }
}
