package aqa.task12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPageObject {

    WebDriver driver;

    @FindBy(xpath = "//li/span[text()='Check Box']")
    private A checkBoxMenu;

    @FindBy(xpath = "//button[contains(@class,'rct-collapse-btn')]")
    private A toggleButton;

    @FindBy(xpath = "//label[contains(@for, 'tree-node-desktop')]/span[contains(@class, 'rct-checkbox')]")
    private A desktopCheckbox;

    @FindBy(xpath = "//label[contains(@for, 'tree-node-downloads')]/span[contains(@class, 'rct-checkbox')]")
    private A downloadsCheckbox;

    public CheckBoxPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new CustomDecorator(driver), this);
    }

    public A getCheckBoxMenu() {
        return checkBoxMenu;
    }

    public A getToggleButton() {
        return toggleButton;
    }

    public A getDesktopCheckbox() {
        return desktopCheckbox;
    }

    public A getDownloadsCheckbox() {
        return downloadsCheckbox;
    }
}
