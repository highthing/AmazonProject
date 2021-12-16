import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchProductLocator = By.id("twotabsearchtextbox");
    By goProductLocator = By.xpath("//*[@id=\"nav-search-submit-button\"]");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
        type(searchProductLocator, text);
        click(goProductLocator);
    }
}
