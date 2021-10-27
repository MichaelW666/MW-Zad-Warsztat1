package warsztat_Zad2;

import common.ConnectionBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage2 extends ConnectionBase {
// przejscie ze strony gownej a potem klikniecie na usera by przjesc do strony logowania
    @Given("user is on site and proceed to login in site")
    public void userIsOnSiteAndProceedToLoginInSite() {
        openChrome();
        driver.get("https://mystore-testlab.coderslab.pl");
        driver.findElement(By.id("_desktop_user_info")).click();
    }

    // podanie maila i hasla, klikniecie zaloguj
    @And ("user login in")
    public void userloginin() {
        driver.findElement(By.name("email")).sendKeys("MikeMyStoreTest@gmail.com");
        driver.findElement(By.name("password")).sendKeys("hasloTestMyStore1234");
        driver.findElement(By.id("submit-login")).click();
    }
    @When("user click clothes")
    public void userclickclothes(){
        driver.findElement(By.id("category-3")).click();
    }

    @And("user chose item")
    public void userChoseItem() {
        // znajduje element towar i klika go
        driver.findElement(By.xpath("//*[@data-id-product-attribute='9']")).click();
    }

    @And("user chose {string} {string}")
    public void userChose(String size, String count) {
        // wybor rozmiaru
        Select listaSize = new Select(driver.findElement(By.id("group_1")));
        listaSize.selectByVisibleText(size);

        // wybor ilosci
        WebElement ilosc = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
        ilosc.clear();
        ilosc.sendKeys(count);
    }
    @When("click addToCart")
    public void clickAddToCart() throws InterruptedException {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='btn btn-primary add-to-cart']"));
        addToCartButton.click();

        WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        Thread.sleep(500);
        proceed.click();

        WebElement proceed2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        Thread.sleep(500);
        proceed2.click();
    }
}
