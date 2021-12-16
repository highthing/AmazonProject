import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickWriteUserName extends BasePage{

    By userLocator = By.id("ap_email");
    By submitUseButtonLocator = By.id("continue");

    public ClickWriteUserName(WebDriver driver) {
        super(driver);
    }

    public void loginDevamEt(String text) {
        type(userLocator, text);
        click(submitUseButtonLocator);
    }
}
