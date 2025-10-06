package task13;

import aqa.task11.DriverProvider;
import aqa.task12.CheckBoxBusinessObject;
import aqa.task13.CustomListener;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Task13Test {
    WebDriver driver;

    @BeforeTest
    void setUp() {
        ChromeDriverManager.getInstance().setup();
        DriverProvider.driver = new ChromeDriver();

    }

    @Test
    public void test13() {
        CheckBoxBusinessObject businessObject = new CheckBoxBusinessObject();
        businessObject.checkBox();
    }

    @AfterTest
    public void tearDown() {
        DriverProvider.quitDriver();
    }
}
