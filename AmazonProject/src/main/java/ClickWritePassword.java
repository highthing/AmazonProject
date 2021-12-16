import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickWritePassword extends BasePage {

    By passwordLocator = By.id("ap_password");
    By goLoginLocator = By.id("signInSubmit");

    public ClickWritePassword(WebDriver driver) {
        super(driver);
    }

    public void loginGirisYap(String text) {
        type(passwordLocator, text);
        click(goLoginLocator);

    }
}
