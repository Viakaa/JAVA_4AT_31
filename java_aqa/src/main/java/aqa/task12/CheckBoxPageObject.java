package aqa.task12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPageObject {

    WebDriver driver;

    @FindBy(xpath = "//li/span[text()='Check Box']")
    private WebElement checkBoxMenu;

    @FindBy(xpath = "//button[contains(@class,'rct-collapse-btn')]")
    private WebElement toggleButton;

    @FindBy(xpath = "//label[contains(@for, 'tree-node-desktop')]/span[contains(@class, 'rct-checkbox')]")
    private WebElement desktopCheckbox;

    @FindBy(xpath = "//label[contains(@for, 'tree-node-downloads')]/span[contains(@class, 'rct-checkbox')]")
    private WebElement downloadsCheckbox;

    public CheckBoxPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public A getCheckBoxMenu() {
        return new A(checkBoxMenu);
    }

    public A getToggleButton() {
        return new A(toggleButton);
    }

    public A getDesktopCheckbox() {
        return new A(desktopCheckbox);
    }

    public A getDownloadsCheckbox() {
        return new A(downloadsCheckbox);
    }
}
