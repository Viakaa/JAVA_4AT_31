package aqa.task12;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static aqa.task11.DriverProvider.driver;

public class CheckBoxBusinessObject {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    CheckBoxPageObject page = new CheckBoxPageObject(driver);

    public void openElementsPage() {
        driver.navigate().to("https://demoqa.com/elements");
    }

    public void selectCheckBoxMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(page.checkBoxMenu())).click();
    }

    public void expandToggleButton() {
        wait.until(ExpectedConditions.elementToBeClickable(page.toggleButton())).click();
    }

    public void checkDesktopCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(page.desktopCheckbox())).click();
    }

    public void checkDownloadsCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(page.downloadsCheckbox())).click();
    }

    public void checkBox() {
        openElementsPage();
        selectCheckBoxMenu();
        expandToggleButton();
        checkDesktopCheckbox();
        checkDownloadsCheckbox();
    }
}
