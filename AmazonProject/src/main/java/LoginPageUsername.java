import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageUsername extends BasePage{

    ClickWriteUserName clickWriteUserName;
    By shippingLoginUsernameLocator = By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[1]/label");


    public LoginPageUsername(WebDriver driver) {
        super(driver);
        clickWriteUserName = new ClickWriteUserName(driver);
    }

    public ClickWriteUserName clickWriteUserName() {
        return this.clickWriteUserName;
    }


    public boolean isOnLoginPageUsername() {
        return  isDisplayed(shippingLoginUsernameLocator);
    }
}
