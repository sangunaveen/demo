package page_objects;

import drivers.DriverFactory;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class HeaderPage extends DriverFactory {

    public void doSearch(String product) {
        driver.findElement(By.id("searchTerm")).sendKeys(product);
        driver.findElement(By.cssSelector(".argos-header__search-button")).click();
     //   sleep(3000);
    }


    public void goToLoginPage(){
        driver.findElement(By.id("")).click();
    }
}