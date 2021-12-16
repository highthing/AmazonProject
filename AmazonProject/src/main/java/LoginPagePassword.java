import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePassword extends BasePage{

    By shippingPasswordLocator = By.id("auth-fpp-link-bottom");


    public LoginPagePassword(WebDriver driver) {
        super(driver);
        clickWritePassword = new ClickWritePassword(driver);
    }
    ClickWritePassword clickWritePassword;

    public ClickWritePassword clickWritePassword() { return this.clickWritePassword; }

    public boolean isOnLoginPagePassword() {
        return isDisplayed(shippingPasswordLocator);
    }
}
