import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By loginPageLocator = By.id("nav-link-accountList-nav-line-1");
    By acceptCookiesLocator = By.id("sp-cc-accept");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loginPlace() {
        click(loginPageLocator);
    }

    public void acceptCookies(){
        if(isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
