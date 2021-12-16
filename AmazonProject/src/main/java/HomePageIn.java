import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class HomePageIn extends BasePage{

    By inHomepageLocator = By.id("nav-link-accountList-nav-line-1");

    By goPcCatagoryLocator = By.xpath("//*[@id=\"nav-xshop\"]/a[8]");
    By selectLoginOutLocator = By.xpath("//*[@id=\"nav-item-signout\"]/span");

    SearchBox searchBox;

    public HomePageIn(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }


    public void pcCatagory() {
        click(goPcCatagoryLocator);
    }


    public void selectLoginOut() {
        click(selectLoginOutLocator);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isOnHomePageIn() {
        return isDisplayed(inHomepageLocator);
    }

}
