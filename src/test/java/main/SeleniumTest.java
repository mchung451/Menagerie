package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

    public static void main (String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\micha\\Desktop\\new chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://34.244.190.165:8080/");
        driver.manage().window().maximize();
        System.out.println("The test has launched!");

        driver.findElement(By.linkText("Welcome to the zoo!")).click();
        if (driver.getCurrentUrl().equals("http://34.244.190.165:8080/WelcomeMessage")){
            System.out.println("Welcome Message Link Passed!");
        }
        else{
            System.out.println("Welcome Message Link Failed...");
        }
        Thread.sleep(5000);
        driver.close();

    }
}
