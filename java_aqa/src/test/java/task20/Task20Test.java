package task20;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Task20Test {

    @Test
    void decimalMultiplicationTest() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("Medium_Phone")
                .setApp("C:\\Users\\home\\Desktop\\AT\\atjava\\apk\\calc.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://192.168.56.1:4723/wd/hub"), options);

        driver.findElement(By.id("com.motorola.cn.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.motorola.cn.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.motorola.cn.calculator:id/dec_point")).click();
        driver.findElement(By.id("com.motorola.cn.calculator:id/digit_5")).click();

        driver.findElement(By.id("com.motorola.cn.calculator:id/op_mul")).click();

        driver.findElement(By.id("com.motorola.cn.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.motorola.cn.calculator:id/dec_point")).click();
        driver.findElement(By.id("com.motorola.cn.calculator:id/digit_2")).click();

        driver.findElement(By.id("com.motorola.cn.calculator:id/eq")).click();

        String result = driver.findElement(By.id("com.motorola.cn.calculator:id/formula_or_result")).getText();
        double expected = 12.5 * 3.2;
        double actual = Double.parseDouble(result);

        assert actual == expected : "Multiplication result mismatch! Expected: " + expected + ", Actual: " + actual;

        driver.quit();
    }
}
