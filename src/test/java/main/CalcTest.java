package main;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    @Test
    //Tests google search calculator
    public void googleCalculator(){


        //Creating a driver object referencing WebDriver
        WebDriver driver;

        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver","C:\\Users\\micha\\Desktop\\new chromedriver\\chromedriver.exe");

        //Instantiating driver
        driver = new ChromeDriver();

        //Set implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch google
        driver.get("https://www.google.com/");

        //Accepting user thingy
        WebElement userPolicy = driver.findElement(By.id("L2AGLb"));
        userPolicy.click();

        //Write 2+2 in google textbox
        driver.findElement(By.xpath("//input [@name=\"q\"]")).sendKeys("2+2");
        driver.findElement(By.xpath("//input [@name=\"q\"]")).sendKeys(Keys.ENTER);

        //Get result from calculator
        WebElement calculatorTextBox = driver.findElement(By.id("cwos"));
        String result = calculatorTextBox.getText();

        //Verify that result of 2+2 is 4
        assertEquals("4",result, "Unexpected result");

        // Quitting
        driver.quit();
    }
}

