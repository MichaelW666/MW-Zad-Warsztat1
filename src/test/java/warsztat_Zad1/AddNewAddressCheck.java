package warsztat_Zad1;

import common.ConnectionBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import warsztat_Zad1.NewAddressForm;

import java.security.PublicKey;
import java.sql.Driver;

public class AddNewAddressCheck extends ConnectionBase {

    //calosc
    //WebElement wszystkieadresy = driver.findElement(By.className("page-content"));
    // lapanie kafla z danymi usera
    //calosc :  "//div[@class='address-body']"


    @Then("checkCorrect {string} {string} {string} {string} {string}")
    public void checkcorrect(String alias, String adres,
                             String postalCode, String city, String phone) {

        WebElement calyAdress = driver.findElement(By.xpath("//div[@class='address-body']"));
        String calyAdresText = calyAdress.getText();


        if (calyAdresText.contains(alias)){
            System.out.println("zawiera "+ alias);
            //  System.out.print();
        } else {
            System.out.println("NIE zawiera "+ alias);
            System.exit(-1);
        }
        if (calyAdresText.contains(adres)){
            System.out.println("zawiera "+ adres);
        }
        if (calyAdresText.contains(postalCode)){
            System.out.println("zawiera "+ postalCode);
        }
        if (calyAdresText.contains(city)){
            System.out.println("zawiera "+ city);
        }
        if (calyAdresText.contains(phone)){
            System.out.println("zawiera "+ phone);
        }
        //Assertions.assertEquals(adresKawalek, adres, "ten sam adres");

    }
    @And("close browser;")
    public void closeBrowserDriverQuit() {
        //driver.close();
        driver.quit();
    }

}
