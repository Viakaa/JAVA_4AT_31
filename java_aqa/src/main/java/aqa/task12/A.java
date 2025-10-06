package aqa.task12;

import org.openqa.selenium.WebElement;

public class A extends Element{

    public A(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        webElement.click();
    }

    public void check() {
        if (!webElement.isSelected()) {
            System.out.println("Checking checkbox");
            webElement.click();
        } else {
            System.out.println("Checkbox is already checked.");
        }
    }

    public void uncheck() {
        if (webElement.isSelected()) {
            System.out.println("Unchecking checkbox");
            webElement.click();
        } else {
            System.out.println("Checkbox is already unchecked.");
        }
    }

    public void isSelected() {
        boolean selected = webElement.isSelected();
        System.out.println("Checkbox selected: " + selected);
    }
}
