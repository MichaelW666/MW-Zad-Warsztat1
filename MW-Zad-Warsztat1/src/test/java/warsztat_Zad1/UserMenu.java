package warsztat_Zad1;

import common.ConnectionBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserMenu  extends ConnectionBase {

    @When("user click {string}")
    public void userClick(String arg0) {
        driver.findElement(By.xpath("//*[@title='Addresses']")).click();

        //data-link-action="add-address"
        driver.findElement(By.xpath("//*[@data-link-action='add-address']")).click();
    }


}
