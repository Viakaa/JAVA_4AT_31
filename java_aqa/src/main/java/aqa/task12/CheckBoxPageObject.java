package aqa.task12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPageObject {
    WebDriver driver;

    public CheckBoxPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement checkBoxMenu() {
        return driver.findElement(By.xpath("//li/span[text()='Check Box']"));
    }

    public WebElement toggleButton() {
        return driver.findElement(By.xpath("//button[contains(@class,'rct-collapse-btn')]"));
    }

    public WebElement desktopCheckbox() {
        return driver.findElement(By.xpath("//label[contains(@for, 'tree-node-desktop')]/span[contains(@class, 'rct-checkbox')]"));
    }

    public WebElement downloadsCheckbox() {
        return driver.findElement(By.xpath("//label[contains(@for, 'tree-node-downloads')]/span[contains(@class, 'rct-checkbox')]"));
    }
}
