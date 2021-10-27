package warsztat_Zad2;

import common.ConnectionBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.io.FileHandler;
import common.ScreenShotDO;

import java.io.File;
import java.io.IOException;

public class Confirmation extends ConnectionBase {

  //  @FindBy(xpath = "//section[@id='checkout-delivery-step']")
  //  public WebElement shippingMethodSection;

    @And("proceed to Checkout")
    public void proceedToCheckout() throws InterruptedException {
        WebElement shippingMethodSection = driver.findElement(By.xpath("//section[@id='checkout-delivery-step']"));
        Thread.sleep(500);
        shippingMethodSection.click();

        WebElement delivery_option = driver.findElement(By.id("delivery_option_1"));
        if (!delivery_option.isSelected()) {
            Thread.sleep(500);
            delivery_option.click();
        }
        WebElement checkout_payment = driver.findElement(By.id("checkout-payment-step"));
        checkout_payment.click();
        Thread.sleep(500);
    }

    @And("sell details")
    public void sellDetails() throws InterruptedException {

        WebElement payment = driver.findElement(By.id("payment-option-1"));
        if (!payment.isSelected()) {
            payment.click();
        }
        Thread.sleep(500);
        WebElement termsCheckbox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        if (!termsCheckbox.isSelected()) {
            termsCheckbox.click();
        }
        Thread.sleep(500);
        // //section/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button
        WebElement  OrderObligationToPay = driver.findElement(By.xpath("//section/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button"));
        OrderObligationToPay.click();
    }


    @Then("make Screenshot")
    public void makeScreenshot() throws IOException {
        ScreenShotDO.ScreenShotTest();
        driver.quit();
    }
}
