package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AshStepDefinitions {

    WebDriver driver;
    JavascriptExecutor jsx;

    @Test
    @Given("I add four different products to my wish list")
    public void addingFourItemsToWishlist(){

        WebDriverManager.chromedriver().setup(); // Line 2

        ChromeOptions options = new ChromeOptions();

        options.setHeadless(true);

        WebDriver driver=new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Launching the website
        driver.get("https://testscriptdemo.com/");
        driver.manage().window().maximize();

        // Accepting Cookies
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/a[1]")).click();

        // Clicking on the Shop section
        driver.findElement(By.xpath("//*[@id=\"menu-item-310\"]/a")).click();

        // Adding to wishlist
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/ul/li[9]/div/div[2]/div/div/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/ul/li[5]/div/div[2]/div/div/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/ul/li[1]/div/div[2]/div/div/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/article/ul/li[2]/div/div[2]/div/div/a/span")).click();

        // Goes into When Section

        jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,-1000)", "");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[3]/div[3]/a/i")).click();
        driver.quit();

    }

    @Test
    @When("I view my wishlist table")
    public void viewWishListTable() {

    }

    @Then("I find four selected items in my Wishlist")
    public void verifyFourItemsInWishlist() {

    }

}

