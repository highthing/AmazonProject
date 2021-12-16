import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    By shippingProductPageLocator = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/span/div/div/div[2]/div/div[1]/div/div/a/div/div[2]/span");
    By goSecondProductPageLocator = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[27]/span/div/div/ul/li[3]/a");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnproductPage() {
        return isDisplayed(shippingProductPageLocator);
    }

    public void goSecondProductPage() {
        click(goSecondProductPageLocator);
    }
}
