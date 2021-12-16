import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PcCatagoryPage extends BasePage{

    By catagoryPageLocation = By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/h1");

    public PcCatagoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnpcCatagoryPage() {
        return isDisplayed(catagoryPageLocation);
    }
}
