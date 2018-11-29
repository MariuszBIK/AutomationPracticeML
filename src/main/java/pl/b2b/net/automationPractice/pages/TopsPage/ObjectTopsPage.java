package pl.b2b.net.automationPractice.pages.TopsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.b2b.net.automationPractice.pages.womenPage.DataWomenPage;

import java.util.List;

public class ObjectTopsPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectTopsPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }


        @FindBy(xpath = DataTopsPage.TOPS_ASSERT)
        private WebElement topsAssert;

    @FindAll(@FindBy (xpath=DataTopsPage.TOPS_PROD_List))
    private List <WebElement> lista;

    private WebElement getTopsAssert (){
        return topsAssert;

    }
    public int getSizeList (){
        return lista.size();
    }
}