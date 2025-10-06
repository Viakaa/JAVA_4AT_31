package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private final By contactLink = By.xpath("//a[.='Contact']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://www.demoblaze.com/");
    }

    public void clickContact() {
        driver.findElement(contactLink).click();
    }
}
