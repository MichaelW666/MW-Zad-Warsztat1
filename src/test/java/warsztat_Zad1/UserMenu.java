package warsztat_Zad1;

import common.ConnectionBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserMenu  extends ConnectionBase {



    @When("user click adres")
    public void userClickAdres() {
        // by przeniesc sie na strone z adresami
        driver.findElement(By.xpath("//*[@title='Addresses']")).click();
    }

    @When("user click delete usunie adres")
    public void userClickDeleteUsunieAdres() {
        // usuniecie z niej 1 adresu
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
                //data-link-action="delete-address"
    }

    @When("user click {string}")
    public void userClick(String arg0) {

        //data-link-action="add-address"
        // dodanie doe niej 1 adresu
        driver.findElement(By.xpath("//*[@data-link-action='add-address']")).click();
    }

}
