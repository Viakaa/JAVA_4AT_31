package task12;

import aqa.task11.DriverProvider;
import aqa.task12.CheckBoxBusinessObject;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task12Test {
    WebDriver driver;

    @BeforeTest
    void setUp() {
        ChromeDriverManager.getInstance().setup();
        DriverProvider.driver = new ChromeDriver();

    }

    @Test
    public void test12() {
        CheckBoxBusinessObject businessObject = new CheckBoxBusinessObject();
        businessObject.checkBox();
    }
}
