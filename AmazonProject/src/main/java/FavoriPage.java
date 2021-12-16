import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoriPage extends BasePage {

    By favoriPageLocator = By.id("profile-list-name");
    By selectDeleteProductLocator = By.xpath("selectDeleteProduct");
    By isListValueIsZeroLocator = By.xpath("isListValueIsZero");

    public FavoriPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnfavoriPage() {
        return isDisplayed(favoriPageLocator);
    }

    public void selectDeleteProduct() {
        click(selectDeleteProductLocator);
    }

    public boolean isListValueIsZero() {
        return isDisplayed(isListValueIsZeroLocator);
    }
}

