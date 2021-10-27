package warsztat_Zad1;

import common.ConnectionBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;

public class MainPage extends ConnectionBase {


    // otwiera strone i klika na sign in buttonie by przejsc do strony logowania
    @Given("an open browser with mystore-testlab.coderslab.pl, user have an account")
    public void anOpenBrowserWithMystoreTestlabCoderslabPlUserHaveAnAccount() {
        openChrome();
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    // pierwszy button na gorze klikniecie METODA
    public void clickSignInButton() {
        driver.findElement(By.id("_desktop_user_info")).click();
    }
    @When("user click on Sign in")
    public void userClickOnSignIn() {
        clickSignInButton();
    }
    @And("user fills login: {string} password: {string} and submit")
    public void userFillsLoginPasswordAndSubmit(String emailLogin, String passwordIn) {
        driver.findElement(By.name("email")).sendKeys(emailLogin);
        //emailLog.sendKeys(emailLogin);
        driver.findElement(By.name("password")).sendKeys(passwordIn);
        //passwordLog.sendKeys(passwordIn);
        driver.findElement(By.id("submit-login")).click();
        //loginButton.click();
    }


}