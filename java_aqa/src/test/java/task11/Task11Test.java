package task11;

import aqa.task11.ContactPage;
import aqa.task11.DriverProvider;
import aqa.task11.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.Assert;

import java.time.Duration;

public class Task11Test {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = DriverProvider.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testContactForm() {
        // 1. Open website
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();

        // 2. Open Contact window
        homePage.clickContact();

        // 3. Fill in the form
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactForm("frfog@example.com", "Froggy", "Hello from FrogLand");

        // 4. Send the message
        contactPage.clickSend();

        // 5. Wait for alert and check
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();

        Assert.assertTrue(alertText.contains("Thanks") || alertText.contains("Please"),
                "Unexpected alert message: " + alertText);

        alert.accept();
    }

    @AfterClass
    public void tearDown() {
        DriverProvider.quitDriver();
    }
}
