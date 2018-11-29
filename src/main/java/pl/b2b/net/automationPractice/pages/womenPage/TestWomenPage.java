package pl.b2b.net.automationPractice.pages.womenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;
import pl.b2b.net.automationPractice.pages.TopsPage.ObjectTopsPage;
import pl.b2b.net.automationPractice.pages.homePage.ObjectHomePage;

public class TestWomenPage {
    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectWomenPage objectWomenPage;
    private ObjectTopsPage objectTopsPage;


    @BeforeClass
    private void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectWomenPage = new ObjectWomenPage(webDriver, wait);
        objectTopsPage = new ObjectTopsPage(webDriver, wait);
    }
@Test
    public void goToTops(){
        objectWomenPage.clickTops();
}

}