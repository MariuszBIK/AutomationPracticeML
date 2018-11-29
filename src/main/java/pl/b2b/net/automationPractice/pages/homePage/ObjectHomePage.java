package pl.b2b.net.automationPractice.pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ObjectHomePage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectHomePage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath =DataHomePage.WOMEN_PAGE)
    private WebElement womenPage;

    public void clickWomenPage(){
        wait.until(ExpectedConditions.elementToBeClickable(womenPage));
        womenPage.click();
    }

}
