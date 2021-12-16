import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest{

    HomePage homePage;
    LoginPageUsername loginPageUsername;
    LoginPagePassword loginPagePassword;
    HomePageIn homePageIn;
    PcCatagoryPage pcCatagoryPage;
    ProductPage productPage;
    SecondProductPage secondProductPage;
    FavoriPage favoriPage;
    ProductDetailPage productDetailPage;


    @Test
    @Order(1)
    public void loginPageControl(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        loginPageUsername = new LoginPageUsername(driver);
        loginPagePassword = new LoginPagePassword(driver);
        homePageIn = new HomePageIn(driver);
        homePage.loginPlace();
        Assertions.assertTrue(loginPageUsername.isOnLoginPageUsername(),
                "you can't go to login place!");

        loginPageUsername.clickWriteUserName().loginDevamEt("ahmetsolmazTest@yandex.com");
        Assertions.assertTrue(loginPagePassword.isOnLoginPagePassword(),
                "wrong email or telephone number!");

        loginPagePassword.clickWritePassword().loginGirisYap("Amazonsifre1.");
        Assertions.assertTrue(homePageIn.isOnHomePageIn(),
                "wrong password, you couldn't in!");
    }

    @Test
    @Order(2)
    public void categoryPageControl(){
        pcCatagoryPage = new PcCatagoryPage(driver);
        homePageIn.pcCatagory();
        Assertions.assertTrue(pcCatagoryPage.isOnpcCatagoryPage(),
                "you can't go to pc catagory page!");
    }

    @Test
    @Order(3)
    public void searchPageControl(){
        productPage = new ProductPage(driver);
        secondProductPage = new SecondProductPage(driver);
        homePageIn.searchBox().search("msi");
        Assertions.assertTrue(productPage.isOnproductPage(),
                "you can't go to pc product page!");
        productPage.goSecondProductPage();
        Assertions.assertTrue(secondProductPage.isOnsecondProductPage(),
                "you can't go to second pc product page!");
    }

    @Test
    @Order(4)
    public void addFavoriControl(){
        productDetailPage = new ProductDetailPage(driver);
        secondProductPage.selectProduct(2);
        productDetailPage.addList();
        Assertions.assertTrue(productDetailPage.isAddedList(),
                "you can't add the product to list!");
    }

    @Test
    @Order(5)
    public void favoriPageControl(){
        favoriPage = new FavoriPage(driver);
        productDetailPage.selectGoToList();
        Assertions.assertTrue(favoriPage.isOnfavoriPage(),
                "you can't go to favori page!");
        favoriPage.selectDeleteProduct();
        Assertions.assertTrue(favoriPage.isListValueIsZero(),
                "you can't delete product!");
    }

    @Test
    @Order(6)
    public void logOut(){
        homePageIn.selectLoginOut();
        Assertions.assertTrue(loginPageUsername.isOnLoginPageUsername(),
                "wrong logout process!");
    }





}
