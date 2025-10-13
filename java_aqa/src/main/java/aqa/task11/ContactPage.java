package aqa.task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final By emailField = By.id("recipient-email");
    private final By nameField = By.id("recipient-name");
    private final By messageField = By.id("message-text");
    private final By sendButton = By.xpath("//button[.='Send message']");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fillContactForm(String email, String name, String message) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickSend() {
        driver.findElement(sendButton).click();
    }
}
