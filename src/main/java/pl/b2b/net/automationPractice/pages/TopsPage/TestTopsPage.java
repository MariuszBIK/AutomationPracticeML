package pl.b2b.net.automationPractice.pages.TopsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;


public class TestTopsPage {
    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectTopsPage objectTopsPage;

    @BeforeClass
    private void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectTopsPage = new ObjectTopsPage(webDriver, wait);
    }

    @Test
    public void checkProductsList(){
        Assert.assertEquals(objectTopsPage.getSizeList(),2);

    }


}