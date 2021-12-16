import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage{

    By addListLocator = By.id("add-to-wishlist-button-submit");
    By xselectProductLocator = By.id("WLHUC_result_itemCount");
    By listCountLocator = By.id("WLHUC_result_itemCount");
    By selectGoToListLocator = By.xpath("//*[@id=\"WLHUC_viewlist\"]/span/span");


    public ProductDetailPage(WebDriver driver) {
        super(driver);

    }

    public boolean isAddedList() {
        return getListCount() > 0;
    }

    public void selectGoToList() {
        click(selectGoToListLocator);
    }


    public void addList() {
        click(addListLocator);
    }

    private int getListCount(){
        String count = find(listCountLocator).getText();
        return Integer.parseInt(count);
    }

}
