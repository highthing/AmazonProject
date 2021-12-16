import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondProductPage extends BasePage{

    By secondProductPageLocator = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[26]/span/div/div/ul/li[3]/a");
    By selectProductLocator = By.id("span.a-size-base-plus");
    public SecondProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnsecondProductPage() {
        return isDisplayed(secondProductPageLocator);
    }

    public void selectProduct(int i) {
        getAllProduct().get(i).click();
    }

    private List<WebElement> getAllProduct(){ return findAll(selectProductLocator);
    }
}
