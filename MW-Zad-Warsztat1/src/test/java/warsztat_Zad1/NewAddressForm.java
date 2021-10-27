package warsztat_Zad1;
import common.ConnectionBase;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class NewAddressForm extends ConnectionBase{
// formularz dodajacy nowy adress dla zalogowanego usera

    @And("user fills cells {string} {string} {string} {string} {string} and click the country")
    public void userFillsCellsAndClickTheCountry(String Alias, String Address, String Zip, String City, String phone) {
        WebElement aliasZ = driver.findElement(By.name("alias"));
        aliasZ.sendKeys(Alias);

        WebElement addressZ = driver.findElement(By.name("address1"));
        addressZ.sendKeys(Address);

        WebElement postCodeZ = driver.findElement(By.name("postcode"));
        postCodeZ.sendKeys(Zip);

        WebElement CityZ = driver.findElement(By.name("city"));
        CityZ.sendKeys(City);

        Select dropdown = new Select(driver.findElement(By.name("id_country")));
        dropdown.selectByVisibleText("United Kingdom");

        WebElement telefon = driver.findElement(By.name("phone"));
        telefon.sendKeys(phone);
        //driver.findElement(By.name("alias")).sendKeys(Alias);
        //driver.findElement(By.name("address1")).sendKeys(Address);
    }
    // wyciagniecie arguemntow?
    public WebElement aliasX = driver.findElement(By.name("alias"));
    public WebElement address = driver.findElement(By.name("address1"));

    @And("Click save Button to add new address")
    public void clickSaveButtonToAddNewAddress() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // element form calosc
        //driver.findElement(By.xpath("//*[@data-id-address='0']")).submit();
        driver.findElement(By.xpath("//*[@id='content']/div/div/form/footer/button")).submit();
       // driver.findElement(By.name("submitAddress")).submit();
    }
}
